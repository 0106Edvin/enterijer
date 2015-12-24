
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/ajla/Documents/DTProjects/enterijer/conf/routes
// @DATE:Thu Dec 24 13:17:35 CET 2015

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:8
  Assets_2: javax.inject.Provider[controllers.Assets],
  // @LINE:11
  Application_1: javax.inject.Provider[controllers.Application],
  // @LINE:38
  Emails_0: javax.inject.Provider[controllers.Emails],
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:8
    Assets_2: javax.inject.Provider[controllers.Assets],
    // @LINE:11
    Application_1: javax.inject.Provider[controllers.Application],
    // @LINE:38
    Emails_0: javax.inject.Provider[controllers.Emails]
  ) = this(errorHandler, Assets_2, Application_1, Emails_0, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, Assets_2, Application_1, Emails_0, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""", """@controllers.Assets@.versioned(path:String = "/public", file:Asset)"""),
    ("""GET""", this.prefix, """@controllers.Application@.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """gallery""", """@controllers.Application@.gallery()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """contact""", """@controllers.Application@.contact()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """univer""", """@controllers.Application@.univer()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """radneploce""", """@controllers.Application@.radneploce()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """MDFfarbani""", """@controllers.Application@.mdffarbani()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """MDF""", """@controllers.Application@.mdf()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """HDFlesonit""", """@controllers.Application@.hdflesonit()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """furniraneploce""", """@controllers.Application@.furniraneploce()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """ivericasirova""", """@controllers.Application@.ivericasirova()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """kuhinje""", """@controllers.Application@.kuhinje()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """plakari""", """@controllers.Application@.plakari()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """kancelarijskinamjestaj""", """@controllers.Application@.kannamjestaj()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """dnevnesobe""", """@controllers.Application@.dnevnesobe()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """djecijesobe""", """@controllers.Application@.djecijesobe()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """spavacesobe""", """@controllers.Application@.spavacesobe()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """predsoblja""", """@controllers.Application@.predsoblja()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """kupatila""", """@controllers.Application@.kupatila()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """email""", """@controllers.Emails@.sendMail()"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:8
  private[this] lazy val controllers_Assets_versioned0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned0_invoker = createInvoker(
    Assets_2.get.versioned(fakeValue[String], fakeValue[Asset]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/$file<.+>"""
    )
  )

  // @LINE:11
  private[this] lazy val controllers_Application_index1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_Application_index1_invoker = createInvoker(
    Application_1.get.index(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "index",
      Nil,
      "GET",
      """ Home page""",
      this.prefix + """"""
    )
  )

  // @LINE:12
  private[this] lazy val controllers_Application_gallery2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("gallery")))
  )
  private[this] lazy val controllers_Application_gallery2_invoker = createInvoker(
    Application_1.get.gallery(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "gallery",
      Nil,
      "GET",
      """""",
      this.prefix + """gallery"""
    )
  )

  // @LINE:13
  private[this] lazy val controllers_Application_contact3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("contact")))
  )
  private[this] lazy val controllers_Application_contact3_invoker = createInvoker(
    Application_1.get.contact(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "contact",
      Nil,
      "GET",
      """""",
      this.prefix + """contact"""
    )
  )

  // @LINE:17
  private[this] lazy val controllers_Application_univer4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("univer")))
  )
  private[this] lazy val controllers_Application_univer4_invoker = createInvoker(
    Application_1.get.univer(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "univer",
      Nil,
      "GET",
      """""",
      this.prefix + """univer"""
    )
  )

  // @LINE:18
  private[this] lazy val controllers_Application_radneploce5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("radneploce")))
  )
  private[this] lazy val controllers_Application_radneploce5_invoker = createInvoker(
    Application_1.get.radneploce(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "radneploce",
      Nil,
      "GET",
      """""",
      this.prefix + """radneploce"""
    )
  )

  // @LINE:19
  private[this] lazy val controllers_Application_mdffarbani6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("MDFfarbani")))
  )
  private[this] lazy val controllers_Application_mdffarbani6_invoker = createInvoker(
    Application_1.get.mdffarbani(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "mdffarbani",
      Nil,
      "GET",
      """""",
      this.prefix + """MDFfarbani"""
    )
  )

  // @LINE:20
  private[this] lazy val controllers_Application_mdf7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("MDF")))
  )
  private[this] lazy val controllers_Application_mdf7_invoker = createInvoker(
    Application_1.get.mdf(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "mdf",
      Nil,
      "GET",
      """""",
      this.prefix + """MDF"""
    )
  )

  // @LINE:21
  private[this] lazy val controllers_Application_hdflesonit8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("HDFlesonit")))
  )
  private[this] lazy val controllers_Application_hdflesonit8_invoker = createInvoker(
    Application_1.get.hdflesonit(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "hdflesonit",
      Nil,
      "GET",
      """""",
      this.prefix + """HDFlesonit"""
    )
  )

  // @LINE:22
  private[this] lazy val controllers_Application_furniraneploce9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("furniraneploce")))
  )
  private[this] lazy val controllers_Application_furniraneploce9_invoker = createInvoker(
    Application_1.get.furniraneploce(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "furniraneploce",
      Nil,
      "GET",
      """""",
      this.prefix + """furniraneploce"""
    )
  )

  // @LINE:23
  private[this] lazy val controllers_Application_ivericasirova10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("ivericasirova")))
  )
  private[this] lazy val controllers_Application_ivericasirova10_invoker = createInvoker(
    Application_1.get.ivericasirova(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "ivericasirova",
      Nil,
      "GET",
      """""",
      this.prefix + """ivericasirova"""
    )
  )

  // @LINE:27
  private[this] lazy val controllers_Application_kuhinje11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("kuhinje")))
  )
  private[this] lazy val controllers_Application_kuhinje11_invoker = createInvoker(
    Application_1.get.kuhinje(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "kuhinje",
      Nil,
      "GET",
      """Namjestaj po mjeri""",
      this.prefix + """kuhinje"""
    )
  )

  // @LINE:28
  private[this] lazy val controllers_Application_plakari12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("plakari")))
  )
  private[this] lazy val controllers_Application_plakari12_invoker = createInvoker(
    Application_1.get.plakari(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "plakari",
      Nil,
      "GET",
      """""",
      this.prefix + """plakari"""
    )
  )

  // @LINE:29
  private[this] lazy val controllers_Application_kannamjestaj13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("kancelarijskinamjestaj")))
  )
  private[this] lazy val controllers_Application_kannamjestaj13_invoker = createInvoker(
    Application_1.get.kannamjestaj(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "kannamjestaj",
      Nil,
      "GET",
      """""",
      this.prefix + """kancelarijskinamjestaj"""
    )
  )

  // @LINE:30
  private[this] lazy val controllers_Application_dnevnesobe14_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("dnevnesobe")))
  )
  private[this] lazy val controllers_Application_dnevnesobe14_invoker = createInvoker(
    Application_1.get.dnevnesobe(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "dnevnesobe",
      Nil,
      "GET",
      """""",
      this.prefix + """dnevnesobe"""
    )
  )

  // @LINE:31
  private[this] lazy val controllers_Application_djecijesobe15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("djecijesobe")))
  )
  private[this] lazy val controllers_Application_djecijesobe15_invoker = createInvoker(
    Application_1.get.djecijesobe(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "djecijesobe",
      Nil,
      "GET",
      """""",
      this.prefix + """djecijesobe"""
    )
  )

  // @LINE:32
  private[this] lazy val controllers_Application_spavacesobe16_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("spavacesobe")))
  )
  private[this] lazy val controllers_Application_spavacesobe16_invoker = createInvoker(
    Application_1.get.spavacesobe(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "spavacesobe",
      Nil,
      "GET",
      """""",
      this.prefix + """spavacesobe"""
    )
  )

  // @LINE:33
  private[this] lazy val controllers_Application_predsoblja17_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("predsoblja")))
  )
  private[this] lazy val controllers_Application_predsoblja17_invoker = createInvoker(
    Application_1.get.predsoblja(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "predsoblja",
      Nil,
      "GET",
      """""",
      this.prefix + """predsoblja"""
    )
  )

  // @LINE:34
  private[this] lazy val controllers_Application_kupatila18_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("kupatila")))
  )
  private[this] lazy val controllers_Application_kupatila18_invoker = createInvoker(
    Application_1.get.kupatila(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "kupatila",
      Nil,
      "GET",
      """""",
      this.prefix + """kupatila"""
    )
  )

  // @LINE:38
  private[this] lazy val controllers_Emails_sendMail19_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("email")))
  )
  private[this] lazy val controllers_Emails_sendMail19_invoker = createInvoker(
    Emails_0.get.sendMail(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Emails",
      "sendMail",
      Nil,
      "POST",
      """""",
      this.prefix + """email"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:8
    case controllers_Assets_versioned0_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned0_invoker.call(Assets_2.get.versioned(path, file))
      }
  
    // @LINE:11
    case controllers_Application_index1_route(params) =>
      call { 
        controllers_Application_index1_invoker.call(Application_1.get.index())
      }
  
    // @LINE:12
    case controllers_Application_gallery2_route(params) =>
      call { 
        controllers_Application_gallery2_invoker.call(Application_1.get.gallery())
      }
  
    // @LINE:13
    case controllers_Application_contact3_route(params) =>
      call { 
        controllers_Application_contact3_invoker.call(Application_1.get.contact())
      }
  
    // @LINE:17
    case controllers_Application_univer4_route(params) =>
      call { 
        controllers_Application_univer4_invoker.call(Application_1.get.univer())
      }
  
    // @LINE:18
    case controllers_Application_radneploce5_route(params) =>
      call { 
        controllers_Application_radneploce5_invoker.call(Application_1.get.radneploce())
      }
  
    // @LINE:19
    case controllers_Application_mdffarbani6_route(params) =>
      call { 
        controllers_Application_mdffarbani6_invoker.call(Application_1.get.mdffarbani())
      }
  
    // @LINE:20
    case controllers_Application_mdf7_route(params) =>
      call { 
        controllers_Application_mdf7_invoker.call(Application_1.get.mdf())
      }
  
    // @LINE:21
    case controllers_Application_hdflesonit8_route(params) =>
      call { 
        controllers_Application_hdflesonit8_invoker.call(Application_1.get.hdflesonit())
      }
  
    // @LINE:22
    case controllers_Application_furniraneploce9_route(params) =>
      call { 
        controllers_Application_furniraneploce9_invoker.call(Application_1.get.furniraneploce())
      }
  
    // @LINE:23
    case controllers_Application_ivericasirova10_route(params) =>
      call { 
        controllers_Application_ivericasirova10_invoker.call(Application_1.get.ivericasirova())
      }
  
    // @LINE:27
    case controllers_Application_kuhinje11_route(params) =>
      call { 
        controllers_Application_kuhinje11_invoker.call(Application_1.get.kuhinje())
      }
  
    // @LINE:28
    case controllers_Application_plakari12_route(params) =>
      call { 
        controllers_Application_plakari12_invoker.call(Application_1.get.plakari())
      }
  
    // @LINE:29
    case controllers_Application_kannamjestaj13_route(params) =>
      call { 
        controllers_Application_kannamjestaj13_invoker.call(Application_1.get.kannamjestaj())
      }
  
    // @LINE:30
    case controllers_Application_dnevnesobe14_route(params) =>
      call { 
        controllers_Application_dnevnesobe14_invoker.call(Application_1.get.dnevnesobe())
      }
  
    // @LINE:31
    case controllers_Application_djecijesobe15_route(params) =>
      call { 
        controllers_Application_djecijesobe15_invoker.call(Application_1.get.djecijesobe())
      }
  
    // @LINE:32
    case controllers_Application_spavacesobe16_route(params) =>
      call { 
        controllers_Application_spavacesobe16_invoker.call(Application_1.get.spavacesobe())
      }
  
    // @LINE:33
    case controllers_Application_predsoblja17_route(params) =>
      call { 
        controllers_Application_predsoblja17_invoker.call(Application_1.get.predsoblja())
      }
  
    // @LINE:34
    case controllers_Application_kupatila18_route(params) =>
      call { 
        controllers_Application_kupatila18_invoker.call(Application_1.get.kupatila())
      }
  
    // @LINE:38
    case controllers_Emails_sendMail19_route(params) =>
      call { 
        controllers_Emails_sendMail19_invoker.call(Emails_0.get.sendMail())
      }
  }
}