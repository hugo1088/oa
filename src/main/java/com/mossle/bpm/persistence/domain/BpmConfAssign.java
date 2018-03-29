package com.mossle.bpm.persistence.domain;

// Generated by Hibernate Tools
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * BpmConfAssign .
 * 
 * @author Lingo
 */
@Entity
@Table(name = "BPM_CONF_ASSIGN")
public class BpmConfAssign implements java.io.Serializable {
    private static final long serialVersionUID = 0L;

    /** null. */
    private Long id;

    /** null. */
    private BpmConfNode bpmConfNode;

    /** null. */
    private String name;

    public BpmConfAssign() {
    }

    public BpmConfAssign(Long id) {
        this.id = id;
    }

    public BpmConfAssign(Long id, BpmConfNode bpmConfNode, String name) {
        this.id = id;
        this.bpmConfNode = bpmConfNode;
        this.name = name;
    }

    /** @return null. */
    @Id
    @Column(name = "ID", unique = true, nullable = false)
    public Long getId() {
        return this.id;
    }

    /**
     * @param id
     *            null.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /** @return null. */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "NODE_ID")
    public BpmConfNode getBpmConfNode() {
        return this.bpmConfNode;
    }

    /**
     * @param bpmConfNode
     *            null.
     */
    public void setBpmConfNode(BpmConfNode bpmConfNode) {
        this.bpmConfNode = bpmConfNode;
    }

    /** @return null. */
    @Column(name = "NAME", length = 50)
    public String getName() {
        return this.name;
    }

    /**
     * @param name
     *            null.
     */
    public void setName(String name) {
        this.name = name;
    }
}
