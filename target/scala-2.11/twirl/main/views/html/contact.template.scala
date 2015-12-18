
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object contact_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

class contact extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*1.2*/main("Studio Enterijer")/*1.26*/{_display_(Seq[Any](format.raw/*1.27*/("""

    """),format.raw/*3.5*/("""<section id="title" class="emerald margin-bottom50">
        <div class="container">
            <div class="row">
                <div class="col-sm-6">
                    <h1>Kontaktirajte nas</h1>
                    <p>Ukoliko imate bilo kakvih pitanja, molimo Vas da nas kontaktirate. Hvala! </p>
                </div>
            </div>
        </div>
    </section><!--/#title-->
    <div class="container">
        <div class="row">
            <div class="col-md-8" style="float: right">
                <div id="mail">
                """),_display_(/*17.18*/if(flash.containsKey("success"))/*17.50*/{_display_(Seq[Any](format.raw/*17.51*/("""
                    """),format.raw/*18.21*/("""<div style="margin-bottom: 10px" class="alert-success alert-success" role="alert">
                        <span class="glyphicon glyphicon-exclamation-sign" aria-hidden="true"></span>
                        <span class="sr-only">Success:</span>
                        """),_display_(/*21.26*/flash/*21.31*/.get("success")),format.raw/*21.46*/("""

                    """),format.raw/*23.21*/("""</div>

                """)))}),format.raw/*25.18*/("""
                """),format.raw/*26.17*/("""</div>
            </div>
        </div>
    </div>


    <div class="container">
        <div class="row">
            <div class="col-md-4">
                <div class="portfolio-item-contact">
                    <div class="margin-bottom30">
                        <h5 class="icon-map-marker"> Adresa </h5>
                        <h6>Hamdije Cemerlica, 7 <br>
                            Sarajevo, Bosnia and Herzegovina
                        </h6>
                    </div>

                    <div class="margin-bottom30">
                        <h5 class="icon-phone"> Telefon</h5>
                        <h6>+387 (61) 957 000 </h6>
                    </div>

                    <div>
                        <h5 class="icon-envelope"> Mail</h5>
                        <h6>mirza.granulo&#64gmail.com</h6>
                    </div>

                </div>

            </div>

            <div class="col-md-8">
                <h4>Kontakt forma</h4>
                <div class="status alert alert-success" style="display: none"></div>
                <form method="post" action=""""),_display_(/*60.46*/routes/*60.52*/.Emails.sendMail()),format.raw/*60.70*/("""">
                    <div class="row">
                        <div class="col-sm-5">
                            <div class="form-group">
                                <input name="name" type="text" class="form-control" required="required" placeholder="Ime">
                            </div>
                            <div class="form-group">
                                <input name="lastname" type="text" class="form-control" required="required" placeholder="Prezime">
                            </div>
                            <div class="form-group">
                                <input name="mail" type="text" class="form-control" required="required" placeholder="Email adresa">
                            </div>
                            <div class="form-group">
                                <button type="submit" class="btn btn-primary btn-lg">Posalji poruku</button>
                            </div>
                        </div>
                        <div class="col-sm-7">
                            <textarea name="message" id="message" required="required" class="form-control" rows="8" placeholder="Poruka" style="resize: vertical"></textarea>
                        </div>
                    </div>
                </form>
            </div><!--/.col-sm-8-->


        </div>


        <section>
            <div class="row" id="margin50top">
                <div class="col-md-12">
                    <div id="map"></div>
                </div>
            </div>
        </section>

    </div>


    <script>
     function initialize() """),format.raw/*99.28*/("""{"""),format.raw/*99.29*/("""
        """),format.raw/*100.9*/("""var mapCanvas = document.getElementById('map');
        var mapOptions = """),format.raw/*101.26*/("""{"""),format.raw/*101.27*/("""
          """),format.raw/*102.11*/("""center: new google.maps.LatLng(43.850572, 18.393421),
          zoom:16,
          mapTypeId: google.maps.MapTypeId.ROADMAP
        """),format.raw/*105.9*/("""}"""),format.raw/*105.10*/("""
        """),format.raw/*106.9*/("""var map = new google.maps.Map(mapCanvas, mapOptions)
        var marker = new google.maps.Marker("""),format.raw/*107.45*/("""{"""),format.raw/*107.46*/("""
            """),format.raw/*108.13*/("""position:"""),format.raw/*108.22*/("""{"""),format.raw/*108.23*/("""lat: 43.850572, lng: 18.393421"""),format.raw/*108.53*/("""}"""),format.raw/*108.54*/(""" """),format.raw/*108.55*/(""",
            map: map,
            title: 'Studio Enterijer'
         """),format.raw/*111.10*/("""}"""),format.raw/*111.11*/(""");
     """),format.raw/*112.6*/("""}"""),format.raw/*112.7*/("""
      """),format.raw/*113.7*/("""google.maps.event.addDomListener(window, 'load', initialize);
  </script>


""")))}))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/**/
object contact extends contact_Scope0.contact
              /*
                  -- GENERATED --
                  DATE: Fri Dec 18 17:13:17 CET 2015
                  SOURCE: E:/New Project/blankProject/app/views/contact.scala.html
                  HASH: d6ae1b001d350d0a9691042bc8ee7f8cc35eb404
                  MATRIX: 831->1|863->25|901->26|935->34|1524->596|1565->628|1604->629|1654->651|1956->926|1970->931|2006->946|2058->970|2116->997|2162->1015|3322->2148|3337->2154|3376->2172|5028->3796|5057->3797|5095->3807|5198->3881|5228->3882|5269->3894|5432->4029|5462->4030|5500->4040|5627->4138|5657->4139|5700->4153|5738->4162|5768->4163|5827->4193|5857->4194|5887->4195|5990->4269|6020->4270|6057->4279|6086->4280|6122->4288
                  LINES: 32->1|32->1|32->1|34->3|48->17|48->17|48->17|49->18|52->21|52->21|52->21|54->23|56->25|57->26|91->60|91->60|91->60|130->99|130->99|131->100|132->101|132->101|133->102|136->105|136->105|137->106|138->107|138->107|139->108|139->108|139->108|139->108|139->108|139->108|142->111|142->111|143->112|143->112|144->113
                  -- GENERATED --
              */
          