
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/ajla/Documents/DTProjects/enterijer/conf/routes
// @DATE:Thu Dec 24 13:17:35 CET 2015

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:8
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:38
  class ReverseEmails(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:38
    def sendMail: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Emails.sendMail",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "email"})
        }
      """
    )
  
  }

  // @LINE:8
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:8
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[Asset]].javascriptUnbind + """)("file", file)})
        }
      """
    )
  
  }

  // @LINE:11
  class ReverseApplication(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:18
    def radneploce: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.radneploce",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "radneploce"})
        }
      """
    )
  
    // @LINE:31
    def djecijesobe: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.djecijesobe",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "djecijesobe"})
        }
      """
    )
  
    // @LINE:21
    def hdflesonit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.hdflesonit",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "HDFlesonit"})
        }
      """
    )
  
    // @LINE:22
    def furniraneploce: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.furniraneploce",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "furniraneploce"})
        }
      """
    )
  
    // @LINE:29
    def kannamjestaj: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.kannamjestaj",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "kancelarijskinamjestaj"})
        }
      """
    )
  
    // @LINE:33
    def predsoblja: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.predsoblja",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "predsoblja"})
        }
      """
    )
  
    // @LINE:34
    def kupatila: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.kupatila",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "kupatila"})
        }
      """
    )
  
    // @LINE:28
    def plakari: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.plakari",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "plakari"})
        }
      """
    )
  
    // @LINE:23
    def ivericasirova: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.ivericasirova",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "ivericasirova"})
        }
      """
    )
  
    // @LINE:30
    def dnevnesobe: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.dnevnesobe",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "dnevnesobe"})
        }
      """
    )
  
    // @LINE:17
    def univer: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.univer",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "univer"})
        }
      """
    )
  
    // @LINE:20
    def mdf: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.mdf",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "MDF"})
        }
      """
    )
  
    // @LINE:32
    def spavacesobe: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.spavacesobe",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "spavacesobe"})
        }
      """
    )
  
    // @LINE:27
    def kuhinje: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.kuhinje",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "kuhinje"})
        }
      """
    )
  
    // @LINE:11
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
    // @LINE:13
    def contact: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.contact",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "contact"})
        }
      """
    )
  
    // @LINE:19
    def mdffarbani: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.mdffarbani",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "MDFfarbani"})
        }
      """
    )
  
    // @LINE:12
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