package com.equipment.model.dto;

import lombok.Data;

/**
 * @author wangzf-c
 * @date 2023/12/7
 */
@Data
public class PageDTO {

    private int limit = 20;

    private int page = 1;

    private String keyWord;
}
