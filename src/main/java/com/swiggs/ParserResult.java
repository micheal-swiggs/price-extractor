package com.swiggs;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Created by micheal on 23/07/17.
 */
@Builder
@EqualsAndHashCode
@Data
public class ParserResult {

    private String open;
    private String high;
    private String low;
    private String last;
    private String close;
    private String volume;
}
