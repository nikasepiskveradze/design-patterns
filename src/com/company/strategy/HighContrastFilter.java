package com.company.strategy;

public class HighContrastFilter implements Filter {
  @Override
  public void apply(String fileName) {
    System.out.println("Applying high contract filter");
  }
}
