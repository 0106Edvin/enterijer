
// @GENERATOR:play-routes-compiler
// @SOURCE:E:/New Project/blankProject/conf/routes
// @DATE:Wed Dec 16 13:03:13 CET 2015


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