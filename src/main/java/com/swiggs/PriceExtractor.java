package com.swiggs;

import java.awt.image.BufferedImage;

/**
 * Created by micheal on 23/07/17.
 */
public class PriceExtractor {

    public ParserResult convertImage (BufferedImage stockImage) {

        //TODO: actually check stockImage.
        return ParserResult.builder()
            .open("151.800")
            .high("153.840")
            .low("151.800")
            .last("153.290")
            .volume("9,880,396")
            .build();
    }
}
