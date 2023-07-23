package com.example.demo.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;

/**
 * Abstract Base Class for Other Entities
 * @author  h.ghahri
 */



@Getter
@Setter
@MappedSuperclass
public class AbstractPersistableCustome implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE , generator = "sequence-generator")
    private Long id;




}
