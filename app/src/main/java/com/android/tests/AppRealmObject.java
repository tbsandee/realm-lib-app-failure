package com.android.tests;

import io.realm.RealmObject;

/**
 * Created by Ben on 1/21/2015.
 */
public class AppRealmObject extends RealmObject {
  private String field;

  public String getField() {
    return field;
  }

  public void setField(String field) {
    this.field = field;
  }
}
