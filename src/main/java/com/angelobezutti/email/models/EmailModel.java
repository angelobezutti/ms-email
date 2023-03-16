package com.angelobezutti.email.models;

import com.angelobezutti.email.enums.StatusEmail;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Data //metodos automaticos
@Entity //entidade no banco
@Table(name = "TB_EMAIL") //CRIA TABELA NO BANCO COM NOME
public class EmailModel implements Serializable {
    private static final long SerialVersionUID = 1L;

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long emailId;
    private String OwnerRef;
    private String emailFrom;
    private String emailTo;
    private String subject;
    @Column(columnDefinition = "text")
    private String text;
    private LocalDateTime sendDateEmail;
    private StatusEmail statusEmail;
}
