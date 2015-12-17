
// @GENERATOR:play-routes-compiler
// @SOURCE:E:/New Project/blankProject/conf/routes
// @DATE:Thu Dec 17 22:24:24 CET 2015


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
