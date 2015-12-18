
// @GENERATOR:play-routes-compiler
// @SOURCE:E:/New Project/blankProject/conf/routes
// @DATE:Fri Dec 18 16:30:33 CET 2015

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  Application_2: javax.inject.Provider[controllers.Application],
  // @LINE:33
  Emails_0: javax.inject.Provider[controllers.Emails],
  // @LINE:41
  Assets_1: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    Application_2: javax.inject.Provider[controllers.Application],
    // @LINE:33
    Emails_0: javax.inject.Provider[controllers.Emails],
    // @LINE:41
    Assets_1: controllers.Assets
  ) = this(errorHandler, Application_2, Emails_0, Assets_1, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, Application_2, Emails_0, Assets_1, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
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
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_Application_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_Application_index0_invoker = createInvoker(
    Application_2.get.index(),
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

  // @LINE:7
  private[this] lazy val controllers_Application_gallery1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("gallery")))
  )
  private[this] lazy val controllers_Application_gallery1_invoker = createInvoker(
    Application_2.get.gallery(),
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

  // @LINE:8
  private[this] lazy val controllers_Application_contact2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("contact")))
  )
  private[this] lazy val controllers_Application_contact2_invoker = createInvoker(
    Application_2.get.contact(),
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

  // @LINE:12
  private[this] lazy val controllers_Application_univer3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("univer")))
  )
  private[this] lazy val controllers_Application_univer3_invoker = createInvoker(
    Application_2.get.univer(),
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

  // @LINE:13
  private[this] lazy val controllers_Application_radneploce4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("radneploce")))
  )
  private[this] lazy val controllers_Application_radneploce4_invoker = createInvoker(
    Application_2.get.radneploce(),
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

  // @LINE:14
  private[this] lazy val controllers_Application_mdffarbani5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("MDFfarbani")))
  )
  private[this] lazy val controllers_Application_mdffarbani5_invoker = createInvoker(
    Application_2.get.mdffarbani(),
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

  // @LINE:15
  private[this] lazy val controllers_Application_mdf6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("MDF")))
  )
  private[this] lazy val controllers_Application_mdf6_invoker = createInvoker(
    Application_2.get.mdf(),
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

  // @LINE:16
  private[this] lazy val controllers_Application_hdflesonit7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("HDFlesonit")))
  )
  private[this] lazy val controllers_Application_hdflesonit7_invoker = createInvoker(
    Application_2.get.hdflesonit(),
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

  // @LINE:17
  private[this] lazy val controllers_Application_furniraneploce8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("furniraneploce")))
  )
  private[this] lazy val controllers_Application_furniraneploce8_invoker = createInvoker(
    Application_2.get.furniraneploce(),
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

  // @LINE:18
  private[this] lazy val controllers_Application_ivericasirova9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("ivericasirova")))
  )
  private[this] lazy val controllers_Application_ivericasirova9_invoker = createInvoker(
    Application_2.get.ivericasirova(),
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

  // @LINE:22
  private[this] lazy val controllers_Application_kuhinje10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("kuhinje")))
  )
  private[this] lazy val controllers_Application_kuhinje10_invoker = createInvoker(
    Application_2.get.kuhinje(),
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

  // @LINE:23
  private[this] lazy val controllers_Application_plakari11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("plakari")))
  )
  private[this] lazy val controllers_Application_plakari11_invoker = createInvoker(
    Application_2.get.plakari(),
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

  // @LINE:24
  private[this] lazy val controllers_Application_kannamjestaj12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("kancelarijskinamjestaj")))
  )
  private[this] lazy val controllers_Application_kannamjestaj12_invoker = createInvoker(
    Application_2.get.kannamjestaj(),
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

  // @LINE:25
  private[this] lazy val controllers_Application_dnevnesobe13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("dnevnesobe")))
  )
  private[this] lazy val controllers_Application_dnevnesobe13_invoker = createInvoker(
    Application_2.get.dnevnesobe(),
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

  // @LINE:26
  private[this] lazy val controllers_Application_djecijesobe14_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("djecijesobe")))
  )
  private[this] lazy val controllers_Application_djecijesobe14_invoker = createInvoker(
    Application_2.get.djecijesobe(),
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

  // @LINE:27
  private[this] lazy val controllers_Application_spavacesobe15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("spavacesobe")))
  )
  private[this] lazy val controllers_Application_spavacesobe15_invoker = createInvoker(
    Application_2.get.spavacesobe(),
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

  // @LINE:28
  private[this] lazy val controllers_Application_predsoblja16_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("predsoblja")))
  )
  private[this] lazy val controllers_Application_predsoblja16_invoker = createInvoker(
    Application_2.get.predsoblja(),
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

  // @LINE:29
  private[this] lazy val controllers_Application_kupatila17_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("kupatila")))
  )
  private[this] lazy val controllers_Application_kupatila17_invoker = createInvoker(
    Application_2.get.kupatila(),
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

  // @LINE:33
  private[this] lazy val controllers_Emails_sendMail18_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("email")))
  )
  private[this] lazy val controllers_Emails_sendMail18_invoker = createInvoker(
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

  // @LINE:41
  private[this] lazy val controllers_Assets_versioned19_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned19_invoker = createInvoker(
    Assets_1.versioned(fakeValue[String], fakeValue[Asset]),
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


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_Application_index0_route(params) =>
      call { 
        controllers_Application_index0_invoker.call(Application_2.get.index())
      }
  
    // @LINE:7
    case controllers_Application_gallery1_route(params) =>
      call { 
        controllers_Application_gallery1_invoker.call(Application_2.get.gallery())
      }
  
    // @LINE:8
    case controllers_Application_contact2_route(params) =>
      call { 
        controllers_Application_contact2_invoker.call(Application_2.get.contact())
      }
  
    // @LINE:12
    case controllers_Application_univer3_route(params) =>
      call { 
        controllers_Application_univer3_invoker.call(Application_2.get.univer())
      }
  
    // @LINE:13
    case controllers_Application_radneploce4_route(params) =>
      call { 
        controllers_Application_radneploce4_invoker.call(Application_2.get.radneploce())
      }
  
    // @LINE:14
    case controllers_Application_mdffarbani5_route(params) =>
      call { 
        controllers_Application_mdffarbani5_invoker.call(Application_2.get.mdffarbani())
      }
  
    // @LINE:15
    case controllers_Application_mdf6_route(params) =>
      call { 
        controllers_Application_mdf6_invoker.call(Application_2.get.mdf())
      }
  
    // @LINE:16
    case controllers_Application_hdflesonit7_route(params) =>
      call { 
        controllers_Application_hdflesonit7_invoker.call(Application_2.get.hdflesonit())
      }
  
    // @LINE:17
    case controllers_Application_furniraneploce8_route(params) =>
      call { 
        controllers_Application_furniraneploce8_invoker.call(Application_2.get.furniraneploce())
      }
  
    // @LINE:18
    case controllers_Application_ivericasirova9_route(params) =>
      call { 
        controllers_Application_ivericasirova9_invoker.call(Application_2.get.ivericasirova())
      }
  
    // @LINE:22
    case controllers_Application_kuhinje10_route(params) =>
      call { 
        controllers_Application_kuhinje10_invoker.call(Application_2.get.kuhinje())
      }
  
    // @LINE:23
    case controllers_Application_plakari11_route(params) =>
      call { 
        controllers_Application_plakari11_invoker.call(Application_2.get.plakari())
      }
  
    // @LINE:24
    case controllers_Application_kannamjestaj12_route(params) =>
      call { 
        controllers_Application_kannamjestaj12_invoker.call(Application_2.get.kannamjestaj())
      }
  
    // @LINE:25
    case controllers_Application_dnevnesobe13_route(params) =>
      call { 
        controllers_Application_dnevnesobe13_invoker.call(Application_2.get.dnevnesobe())
      }
  
    // @LINE:26
    case controllers_Application_djecijesobe14_route(params) =>
      call { 
        controllers_Application_djecijesobe14_invoker.call(Application_2.get.djecijesobe())
      }
  
    // @LINE:27
    case controllers_Application_spavacesobe15_route(params) =>
      call { 
        controllers_Application_spavacesobe15_invoker.call(Application_2.get.spavacesobe())
      }
  
    // @LINE:28
    case controllers_Application_predsoblja16_route(params) =>
      call { 
        controllers_Application_predsoblja16_invoker.call(Application_2.get.predsoblja())
      }
  
    // @LINE:29
    case controllers_Application_kupatila17_route(params) =>
      call { 
        controllers_Application_kupatila17_invoker.call(Application_2.get.kupatila())
      }
  
    // @LINE:33
    case controllers_Emails_sendMail18_route(params) =>
      call { 
        controllers_Emails_sendMail18_invoker.call(Emails_0.get.sendMail())
      }
  
    // @LINE:41
    case controllers_Assets_versioned19_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned19_invoker.call(Assets_1.versioned(path, file))
      }
  }
}