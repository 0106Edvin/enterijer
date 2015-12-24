
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/ajla/Documents/DTProjects/enterijer/conf/routes
// @DATE:Thu Dec 24 13:17:35 CET 2015


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
