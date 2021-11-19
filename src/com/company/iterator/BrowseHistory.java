package com.company.iterator;

import java.util.ArrayList;
import java.util.List;

public class BrowseHistory {
  private List<String> urls = new ArrayList<>();

  public void push(String url) {
    urls.add(url);
  }

  public String pop() {
    var lastIndex = urls.size() - 1;
    var lastUrl = urls.get(lastIndex);
    urls.remove(lastUrl);

    return lastUrl;
  }

  public Iterator createIterator() {
    return new ListIterator(this);
  }

  // Concrete Iterator
  public class ListIterator implements Iterator {
    private BrowseHistory browseHistory;
    private int index;

    public ListIterator(BrowseHistory browseHistory) {
      this.browseHistory = browseHistory;
    }

    @Override
    public boolean hasNext() {
      return (index < browseHistory.urls.size());
    }

    @Override
    public String current() {
      return browseHistory.urls.get(index);
    }

    @Override
    public void next() {
      index++;
    }
  }

}
