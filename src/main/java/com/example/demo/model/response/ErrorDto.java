package com.example.demo.model.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ErrorDto {

    private String msg;
    private String code;
    private boolean showMsg;
    private String type;

    public ErrorDto(String msg) {
        this.msg = msg;
    }

    public ErrorDto(String errorCode, String errorMsg) {
        this.msg = errorMsg;
        this.code = String.valueOf(errorCode);
    }
}
