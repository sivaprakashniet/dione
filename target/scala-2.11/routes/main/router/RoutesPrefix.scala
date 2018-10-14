
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/rk.arvind/Downloads/Web App/basic-api-app - Test/amplifyr-server/conf/routes
// @DATE:Tue Oct 24 16:23:54 IST 2017


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
