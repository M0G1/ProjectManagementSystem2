package hello.domain;
;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity     //гооврит базе данных, что нужно создать такую сущность
public class Message {
    @Id                                                 //идентификатор в таблице
    @GeneratedValue(strategy = GenerationType.AUTO)     //автогенерация
    @Getter @Setter private Long id;

    @Getter @Setter private String text;
    @Getter @Setter private String tag;
}