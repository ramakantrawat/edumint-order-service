package com.example.demo.model.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BaseApiResponse<T> {

    T data;
    List<ErrorDto> errors;
    private Boolean error;

    public BaseApiResponse(T data) {
        this.data = data;
    }

    public BaseApiResponse(List<ErrorDto> errors) {
        this.error = true;
        this.errors = errors;
    }

    public BaseApiResponse(ErrorDto errorDto) {
        this.error = true;
        this.errors = new ArrayList<>();
        this.errors.add(errorDto);
    }
}
