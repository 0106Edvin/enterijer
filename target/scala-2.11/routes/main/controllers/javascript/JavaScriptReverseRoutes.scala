
// @GENERATOR:play-routes-compiler
// @SOURCE:E:/New Project/blankProject/conf/routes
// @DATE:Thu Dec 17 22:24:24 CET 2015

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:38
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:38
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[Asset]].javascriptUnbind + """)("file", file)})
        }
      """
    )
  
  }

  // @LINE:6
  class ReverseApplication(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:13
    def radneploce: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.radneploce",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "radneploce"})
        }
      """
    )
  
    // @LINE:26
    def djecijesobe: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.djecijesobe",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "djecijesobe"})
        }
      """
    )
  
    // @LINE:16
    def hdflesonit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.hdflesonit",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "HDFlesonit"})
        }
      """
    )
  
    // @LINE:17
    def furniraneploce: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.furniraneploce",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "furniraneploce"})
        }
      """
    )
  
    // @LINE:24
    def kannamjestaj: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.kannamjestaj",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "kancelarijskinamjestaj"})
        }
      """
    )
  
    // @LINE:28
    def predsoblja: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.predsoblja",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "predsoblja"})
        }
      """
    )
  
    // @LINE:29
    def kupatila: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.kupatila",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "kupatila"})
        }
      """
    )
  
    // @LINE:23
    def plakari: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.plakari",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "plakari"})
        }
      """
    )
  
    // @LINE:18
    def ivericasirova: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.ivericasirova",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "ivericasirova"})
        }
      """
    )
  
    // @LINE:25
    def dnevnesobe: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.dnevnesobe",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "dnevnesobe"})
        }
      """
    )
  
    // @LINE:12
    def univer: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.univer",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "univer"})
        }
      """
    )
  
    // @LINE:15
    def mdf: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.mdf",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "MDF"})
        }
      """
    )
  
    // @LINE:27
    def spavacesobe: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.spavacesobe",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "spavacesobe"})
        }
      """
    )
  
    // @LINE:22
    def kuhinje: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.kuhinje",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "kuhinje"})
        }
      """
    )
  
    // @LINE:6
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
    // @LINE:8
    def contact: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.contact",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "contact"})
        }
      """
    )
  
    // @LINE:14
    def mdffarbani: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.mdffarbani",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "MDFfarbani"})
        }
      """
    )
  
    // @LINE:7
    def gallery: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.gallery",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "gallery"})
        }
      """
    )
  
  }


}