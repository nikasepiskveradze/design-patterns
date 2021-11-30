package com.company;

import com.company.command.*;
import com.company.command.fx.Button;
import com.company.template.TransferMoneyTask;

public class Main {

  public static void main(String[] args) {
    var composite = new CompositeCommand();
    composite.add(new ResizeCommand());
    composite.add(new BlackAndWhiteCommand());

    composite.execute();
  }
}