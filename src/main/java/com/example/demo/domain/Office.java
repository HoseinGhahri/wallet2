package com.example.demo.domain;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;


/**
 * Office Entity
 *
 * @author h.ghahri
 */


@Getter
@Setter
@Entity
@Table(name = "Office", uniqueConstraints = {@UniqueConstraint(columnNames = {"name"}, name = "name_unique")})
public class Office extends AbstractPersistableCustome implements Serializable {


    @Column(name = "name", nullable = false, length = 100)
    private String name;

    @Column(name = "openingDate", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date openingDate;

    @Column(name = "externalId", length = 100)
    private Long externalId;

    @OneToMany(mappedBy = "parent", fetch = FetchType.LAZY)
    private Set<Office> children = new HashSet<>();

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "parent_id")
    private Office parent;

}
