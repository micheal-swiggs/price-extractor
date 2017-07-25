package com.swiggs;

import org.junit.Test;

import javax.imageio.ImageIO;

import java.awt.image.BufferedImage;
import java.io.IOException;

import static org.junit.Assert.*;

/**
 * Created by micheal on 23/07/17.
 */
public class PriceExtractorTest {

    @Test
    public void testAAPL() throws Exception {

        PriceExtractor extractor = new PriceExtractor();
        ParserResult expected = build(ParserResult.builder()
            .open("151.800")
            .high("153.840")
            .low("151.800")
            .last("153.290")
            .volume("9,880,396")
        );

        ParserResult actual = extractor.convertImage(loadImage("/last/AAPL.png"));

        assertEquals(expected, actual);
    }

    @Test
    public void testAXP() throws Exception {

        PriceExtractor extractor = new PriceExtractor();
        ParserResult expected = build(ParserResult.builder()
            .open("85.84")
            .high("86.10")
            .low("85.08")
            .last("85.47")
            .volume("1,374,825")
        );

        ParserResult actual = extractor.convertImage(loadImage("/last/AXP.png"));

        assertEquals(expected, actual);
    }

    @Test
    public void testBA() throws Exception {

        PriceExtractor extractor = new PriceExtractor();
        ParserResult expected = build(ParserResult.builder()
            .open("213.220")
            .high("214.000")
            .low("212.510")
            .last("213.020")
            .volume("1,142,004")
        );

        ParserResult actual = extractor.convertImage(loadImage("/last/BA.png"));

        assertEquals(expected, actual);
    }
    @Test
    public void testBPSPX() throws Exception {

        PriceExtractor extractor = new PriceExtractor();
        ParserResult expected = build(ParserResult.builder()
            .open("74.80")
            .high("75.60")
            .low("74.80")
            .last("75.60")
            .volume("0")
        );

        ParserResult actual = extractor.convertImage(loadImage("/last/BPSPX.png"));

        assertEquals(expected, actual);
    }

    @Test
    public void testCAT() throws Exception {

        PriceExtractor extractor = new PriceExtractor();
        ParserResult expected = build(ParserResult.builder()
            .open("113.24")
            .high("114.00")
            .low("111.80")
            .last("113.75")
            .volume("8,241,365")
        );

        ParserResult actual = extractor.convertImage(loadImage("/last/CAT.png"));

        assertEquals(expected, actual);
    }

    @Test
    public void testCSCO() throws Exception {

        PriceExtractor extractor = new PriceExtractor();
        ParserResult expected = build(ParserResult.builder()
            .open("31.900")
            .high("32.250")
            .low("31.880")
            .last("32.140")
            .volume("6,842,720")
        );

        ParserResult actual = extractor.convertImage(loadImage("/last/CSCO.png"));

        assertEquals(expected, actual);
    }

    @Test
    public void testCVX() throws Exception {

        PriceExtractor extractor = new PriceExtractor();
        ParserResult expected = build(ParserResult.builder()
            .open("104.45")
            .high("105.15")
            .low("104.32")
            .last("104.99")
            .volume("2,273,240")
        );

        ParserResult actual = extractor.convertImage(loadImage("/last/CVX.png"));

        assertEquals(expected, actual);
    }

    @Test
    public void testDD() throws Exception {

        PriceExtractor extractor = new PriceExtractor();
        ParserResult expected = build(ParserResult.builder()
            .open("85.80")
            .high("86.36")
            .low("85.12")
            .last("85.60")
            .volume("1,200,161")
        );

        ParserResult actual = extractor.convertImage(loadImage("/last/DD.png"));

        assertEquals(expected, actual);
    }

    @Test
    public void testDIS() throws Exception {

        PriceExtractor extractor = new PriceExtractor();
        ParserResult expected = build(ParserResult.builder()
            .open("107.600")
            .high("107.780")
            .low("106.480")
            .last("106.570")
            .volume("2,118,235")
        );

        ParserResult actual = extractor.convertImage(loadImage("/last/DIS.png"));

        assertEquals(expected, actual);
    }

    @Test
    public void testGE() throws Exception {

        PriceExtractor extractor = new PriceExtractor();
        ParserResult expected = build(ParserResult.builder()
            .open("25.57")
            .high("25.73")
            .low("25.36")
            .last("25.61")
            .volume("19,000,556")
        );

        ParserResult actual = extractor.convertImage(loadImage("/last/GE.png"));

        assertEquals(expected, actual);
    }

    @Test
    public void testGS() throws Exception {

        PriceExtractor extractor = new PriceExtractor();
        ParserResult expected = build(ParserResult.builder()
            .open("220.34")
            .high("222.82")
            .low("220.18")
            .last("222.82")
            .volume("2,139,939")
        );

        ParserResult actual = extractor.convertImage(loadImage("/last/GS.png"));

        assertEquals(expected, actual);
    }

    @Test
    public void testHD() throws Exception {

        PriceExtractor extractor = new PriceExtractor();
        ParserResult expected = build(ParserResult.builder()
            .open("145.74")
            .high("147.38")
            .low("145.28")
            .last("147.27")
            .volume("2,297,146")
        );

        ParserResult actual = extractor.convertImage(loadImage("/last/HD.png"));

        assertEquals(expected, actual);
    }

    @Test
    public void testIBM() throws Exception {

        PriceExtractor extractor = new PriceExtractor();
        ParserResult expected = build(ParserResult.builder()
            .open("146.570")
            .high("147.490")
            .low("146.130")
            .last("146.880")
            .volume("1,936,757")
        );

        ParserResult actual = extractor.convertImage(loadImage("/last/IBM.png"));

        assertEquals(expected, actual);
    }

    @Test
    public void testINTC() throws Exception {

        PriceExtractor extractor = new PriceExtractor();
        ParserResult expected = build(ParserResult.builder()
            .open("34.5500")
            .high("34.7300")
            .low("34.4000")
            .last("34.7050")
            .volume("7,288,765")
        );

        ParserResult actual = extractor.convertImage(loadImage("/last/INTC.png"));

        assertEquals(expected, actual);
    }

    @Test
    public void testJNJ() throws Exception {

        PriceExtractor extractor = new PriceExtractor();
        ParserResult expected = build(ParserResult.builder()
            .open("133.740")
            .high("133.900")
            .low("131.460")
            .last("131.690")
            .volume("2,269,865")
        );

        ParserResult actual = extractor.convertImage(loadImage("/last/JNJ.png"));

        assertEquals(expected, actual);
    }

    @Test
    public void testSPY() throws Exception {

        PriceExtractor extractor = new PriceExtractor();
        ParserResult expected = build(ParserResult.builder()
            .open("247.68")
            .high("247.80")
            .low("247.15")
            .last("247.63")
            .volume("24,665,582")
        );

        ParserResult actual = extractor.convertImage(loadImage("/last/SPY.png"));

        assertEquals(expected, actual);
    }

    @Test
    public void testVIX() throws Exception {

        PriceExtractor extractor = new PriceExtractor();
        ParserResult expected = build(ParserResult.builder()
            .open("9.400")
            .high("9.420")
            .low("9.040")
            .last("9.360")
            .volume("0")
        );

        ParserResult actual = extractor.convertImage(loadImage("/last/VIX.png"));

        assertEquals(expected, actual);
    }

    public BufferedImage loadImage (String imageName) throws IOException {

        return ImageIO.read(getClass().getResource(imageName));
    }

    private ParserResult build (ParserResult.ParserResultBuilder builder) {

        ParserResult result = builder.build();

        if (dbl(result.getHigh()) < dbl(result.getLow())) {

            throw new RuntimeException("Invalid high & low");
        }

        if (dbl(result.getOpen()) > dbl(result.getHigh()) || dbl(result.getOpen()) < dbl(result.getLow())){

            throw new RuntimeException("Invalid open");
        }

        if (dbl(result.getLast()) > dbl(result.getHigh()) || dbl(result.getLast()) < dbl(result.getLow())){

            throw new RuntimeException("Invalid last");
        }
        return result;
    }

    private Double dbl(String val) {

        return Double.parseDouble(val);
    }

}
