
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/ajla/Documents/DTProjects/enterijer/conf/routes
// @DATE:Thu Dec 24 13:17:35 CET 2015

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseEmails Emails = new controllers.ReverseEmails(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseApplication Application = new controllers.ReverseApplication(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseEmails Emails = new controllers.javascript.ReverseEmails(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseApplication Application = new controllers.javascript.ReverseApplication(RoutesPrefix.byNamePrefix());
  }

}
