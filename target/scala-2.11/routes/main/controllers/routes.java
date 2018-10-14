
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/rk.arvind/Downloads/Web App/basic-api-app - Test/amplifyr-server/conf/routes
// @DATE:Tue Oct 24 16:23:54 IST 2017

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseDBConnectionController DBConnectionController = new controllers.ReverseDBConnectionController(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseDBConnectionController DBConnectionController = new controllers.javascript.ReverseDBConnectionController(RoutesPrefix.byNamePrefix());
  }

}
