package com.project.payload.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)//Eger message bos ise veya classta herhangi bir degeri null ise
// json icinde gozukmemesini saglar
public class ResponseMessage<E> {

    private E object;

    private HttpStatus httpStatus;

    private String message;
}
