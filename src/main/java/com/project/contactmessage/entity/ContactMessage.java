package com.project.contactmessage.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)//Bizim yeni bir contact message olusturma isleminde aynı variablelar icin new leme
// yaparken kullanacagım contactmessage.1name vs vs gibi olan variable ları setlerken digerlerini
// clone layip sadece degisterecegimi .name .email seklinde getirmeyi saglar.(contactmessage.1(kurtarır)
// Boylelikle bana clonelama kolaylıgı saglayip variablelari tek tek setlenip boiler plate olmasini onler
// toBuilder =true clonelamaya izin verir ve contact message variablelari clonlanabilir yapar.
public class ContactMessage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    private String name;
    @NotNull
    @Email(message = "please enter valid email")
    private String email;
    @NotNull
    private String subject;
    @NotNull
    private String message;
    @JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "yyyy-MM-dd HH:mm",timezone = "US")
    private LocalDateTime dateTime;

}
