package com.mossle.customer.web;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mossle.api.tenant.TenantHolder;
import com.mossle.api.user.UserConnector;

import com.mossle.core.export.Exportor;
import com.mossle.core.export.TableModel;
import com.mossle.core.mapper.BeanMapper;
import com.mossle.core.page.Page;
import com.mossle.core.query.PropertyFilter;
import com.mossle.core.spring.MessageHelper;

import com.mossle.customer.persistence.domain.CustomerInfo;
import com.mossle.customer.persistence.manager.CustomerInfoManager;

import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("customer")
public class CustomerInfoController {
    private CustomerInfoManager customerInfoManager;
    private Exportor exportor;
    private BeanMapper beanMapper = new BeanMapper();
    private UserConnector userConnector;
    private MessageHelper messageHelper;
    private TenantHolder tenantHolder;

    @RequestMapping("customer-info-list")
    public String list(@ModelAttribute Page page,
            @RequestParam Map<String, Object> parameterMap, Model model) {
        String tenantId = tenantHolder.getTenantId();
        List<PropertyFilter> propertyFilters = PropertyFilter
                .buildFromMap(parameterMap);
        propertyFilters.add(new PropertyFilter("EQS_tenantId", tenantId));
        page = customerInfoManager.pagedQuery(page, propertyFilters);

        model.addAttribute("page", page);

        return "customer/customer-info-list";
    }

    @RequestMapping("customer-info-input")
    public String input(@RequestParam(value = "id", required = false) Long id,
            Model model) {
        if (id != null) {
            CustomerInfo customerInfo = customerInfoManager.get(id);
            model.addAttribute("model", customerInfo);
        }

        return "customer/customer-info-input";
    }

    @RequestMapping("customer-info-save")
    public String save(@ModelAttribute CustomerInfo customerInfo,
            @RequestParam Map<String, Object> parameterMap,
            RedirectAttributes redirectAttributes) {
        String tenantId = tenantHolder.getTenantId();
        CustomerInfo dest = null;

        Long id = customerInfo.getId();

        if (id != null) {
            dest = customerInfoManager.get(id);
            beanMapper.copy(customerInfo, dest);
        } else {
            dest = customerInfo;
            dest.setTenantId(tenantId);
        }

        customerInfoManager.save(dest);

        messageHelper.addFlashMessage(redirectAttributes, "core.success.save",
                "保存成功");

        return "redirect:/customer/customer-info-list.do";
    }

    @RequestMapping("customer-info-remove")
    public String remove(@RequestParam("selectedItem") List<Long> selectedItem,
            RedirectAttributes redirectAttributes) {
        List<CustomerInfo> customerInfos = customerInfoManager
                .findByIds(selectedItem);

        customerInfoManager.removeAll(customerInfos);

        messageHelper.addFlashMessage(redirectAttributes,
                "core.success.delete", "删除成功");

        return "redirect:/customer/customer-info-list.do";
    }

    @RequestMapping("customer-info-export")
    public void export(@ModelAttribute Page page,
            @RequestParam Map<String, Object> parameterMap,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        String tenantId = tenantHolder.getTenantId();
        List<PropertyFilter> propertyFilters = PropertyFilter
                .buildFromMap(parameterMap);
        propertyFilters.add(new PropertyFilter("EQS_tenantId", tenantId));
        page = customerInfoManager.pagedQuery(page, propertyFilters);

        List<CustomerInfo> customerInfos = (List<CustomerInfo>) page
                .getResult();

        TableModel tableModel = new TableModel();
        tableModel.setName("customer info");
        tableModel.addHeaders("id", "name");
        tableModel.setData(customerInfos);
        exportor.export(request, response, tableModel);
    }

    // ~ ======================================================================
    @Resource
    public void setCustomerInfoManager(CustomerInfoManager customerInfoManager) {
        this.customerInfoManager = customerInfoManager;
    }

    @Resource
    public void setExportor(Exportor exportor) {
        this.exportor = exportor;
    }

    @Resource
    public void setUserConnector(UserConnector userConnector) {
        this.userConnector = userConnector;
    }

    @Resource
    public void setMessageHelper(MessageHelper messageHelper) {
        this.messageHelper = messageHelper;
    }

    @Resource
    public void setTenantHolder(TenantHolder tenantHolder) {
        this.tenantHolder = tenantHolder;
    }
}
