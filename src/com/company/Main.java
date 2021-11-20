package com.company;

import com.company.strategy.BlackAndWhiteFilter;
import com.company.strategy.ImageStorage;
import com.company.strategy.JpegCompressor;

public class Main {

  public static void main(String[] args) {
    var imageStorage = new ImageStorage(new JpegCompressor(), new BlackAndWhiteFilter());
    imageStorage.store("Test file name");
  }
}