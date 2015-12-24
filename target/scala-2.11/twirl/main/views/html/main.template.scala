
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object main_Scope0 {
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

     object main_Scope1 {
import helper._

class main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.32*/("""
"""),format.raw/*3.1*/("""<!DOCTYPE html>

<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="description" content="">
        <meta name="author" content="">

        <title>"""),_display_(/*12.17*/title),format.raw/*12.22*/("""</title>

        <!-- Bootstrap -->
        <link rel="stylesheet" media="screen" href='"""),_display_(/*15.54*/routes/*15.60*/.Assets.versioned("stylesheets/bootstrap.min.css")),format.raw/*15.110*/("""'>

        <link rel="stylesheet" media="screen" href='"""),_display_(/*17.54*/routes/*17.60*/.Assets.versioned("stylesheets/font-awesome.min.css")),format.raw/*17.113*/("""'>
        <link rel="stylesheet" media="screen" href='"""),_display_(/*18.54*/routes/*18.60*/.Assets.versioned("stylesheets/prettyPhoto.css")),format.raw/*18.108*/("""'>
        <link rel="stylesheet" media="screen" href='"""),_display_(/*19.54*/routes/*19.60*/.Assets.versioned("stylesheets/animate.css")),format.raw/*19.104*/("""'>
        <link rel="stylesheet" media="screen" href='"""),_display_(/*20.54*/routes/*20.60*/.Assets.versioned("stylesheets/main.css")),format.raw/*20.101*/("""'>

        <script src='"""),_display_(/*22.23*/routes/*22.29*/.Assets.versioned("javascripts/bootstrap.js")),format.raw/*22.74*/("""' type="text/javascript"></script>



        <script src='"""),_display_(/*26.23*/routes/*26.29*/.Assets.versioned("javascripts/html5shiv.js")),format.raw/*26.74*/("""' type="text/javascript"></script>
        <script src='"""),_display_(/*27.23*/routes/*27.29*/.Assets.versioned("javascripts/respond.min.js")),format.raw/*27.76*/("""' type="text/javascript"></script>
        <script src='"""),_display_(/*28.23*/routes/*28.29*/.Assets.versioned("javascripts/jquery.js")),format.raw/*28.71*/("""' type="text/javascript"></script>
        <script src='"""),_display_(/*29.23*/routes/*29.29*/.Assets.versioned("javascripts/bootstrap.min.js")),format.raw/*29.78*/("""' type="text/javascript"></script>
        <script src='"""),_display_(/*30.23*/routes/*30.29*/.Assets.versioned("javascripts/jquery.prettyPhoto.js")),format.raw/*30.83*/("""' type="text/javascript"></script>
        <script src='"""),_display_(/*31.23*/routes/*31.29*/.Assets.versioned("javascripts/main.js")),format.raw/*31.69*/("""' type="text/javascript"></script>

        """),format.raw/*33.121*/("""


        """),format.raw/*36.9*/("""<script src="https://maps.googleapis.com/maps/api/js"></script>


        <script src='"""),_display_(/*39.23*/routes/*39.29*/.Assets.versioned("javascripts/jQuerry.easyPaginate.js")),format.raw/*39.85*/("""'></script>


        <!--[if lt IE 9]>
            <![endif]-->
        <link rel="shortcut icon" href='"""),_display_(/*44.42*/routes/*44.48*/.Assets.versioned("images/ico/favicon.png")),format.raw/*44.91*/("""'>
        <link rel="apple-touch-icon-precomposed" sizes="144x144" href='"""),_display_(/*45.73*/routes/*45.79*/.Assets.versioned("images/ico/favicon.png")),format.raw/*45.122*/("""'>
        <link rel="apple-touch-icon-precomposed" sizes="114x114" href='"""),_display_(/*46.73*/routes/*46.79*/.Assets.versioned("images/ico/favicon.png")),format.raw/*46.122*/("""'>
        <link rel="apple-touch-icon-precomposed" sizes="72x72" href='"""),_display_(/*47.71*/routes/*47.77*/.Assets.versioned("images/ico/favicon.png")),format.raw/*47.120*/("""'>
        <link rel="apple-touch-icon-precomposed" href='"""),_display_(/*48.57*/routes/*48.63*/.Assets.versioned("images/ico/favicon.png")),format.raw/*48.106*/("""'>
    </head>


    <header class="navbar navbar-inverse navbar-fixed-top wet-asphalt" role="banner">
        <div class="container">
            <div class="row">
                <div class="col-md-2">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href=""""),_display_(/*63.48*/routes/*63.54*/.Application.index()),format.raw/*63.74*/(""""><img src='"""),_display_(/*63.87*/routes/*63.93*/.Assets.versioned("images/logo.png")),format.raw/*63.129*/("""' alt="logo"></a>
            </div>
                </div>
                <div class="col-md-10">

                <div class="collapse navbar-collapse">
                <ul class="nav navbar-nav navbar-right">
                    <li class="dropdown">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown">Plocasti materijali <i class="icon-angle-down"></i></a>
                        <ul class="dropdown-menu">
                            <li><a href=""""),_display_(/*73.43*/routes/*73.49*/.Application.univer()),format.raw/*73.70*/("""">Univer</a></li>
                            <li><a href=""""),_display_(/*74.43*/routes/*74.49*/.Application.radneploce()),format.raw/*74.74*/("""">Radne ploce</a></li>
                            <li><a href=""""),_display_(/*75.43*/routes/*75.49*/.Application.mdffarbani()),format.raw/*75.74*/("""">MDF Farbani</a></li>
                            <li><a href=""""),_display_(/*76.43*/routes/*76.49*/.Application.mdf()),format.raw/*76.67*/("""">MDF</a></li>
                            <li><a href=""""),_display_(/*77.43*/routes/*77.49*/.Application.hdflesonit()),format.raw/*77.74*/("""">HDF Lesonit</a></li>
                            <li><a href=""""),_display_(/*78.43*/routes/*78.49*/.Application.furniraneploce()),format.raw/*78.78*/("""">Furnirane ploce</a></li>
                            <li><a href=""""),_display_(/*79.43*/routes/*79.49*/.Application.ivericasirova()),format.raw/*79.77*/("""">Iverica sirova</a></li>
                        </ul>
                    </li>

                    <li class="dropdown">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown">Namjestaj po mjeri <i class="icon-angle-down"></i></a>
                        <ul class="dropdown-menu">
                            <li><a href=""""),_display_(/*86.43*/routes/*86.49*/.Application.kuhinje()),format.raw/*86.71*/("""">Kuhinje</a></li>
                            <li><a href=""""),_display_(/*87.43*/routes/*87.49*/.Application.plakari()),format.raw/*87.71*/("""">Plakari</a></li>
                            <li><a href=""""),_display_(/*88.43*/routes/*88.49*/.Application.kannamjestaj()),format.raw/*88.76*/("""">Kancelarijski namjestaj</a></li>
                            <li><a href=""""),_display_(/*89.43*/routes/*89.49*/.Application.dnevnesobe()),format.raw/*89.74*/("""">Dnevne sobe</a></li>
                            <li><a href=""""),_display_(/*90.43*/routes/*90.49*/.Application.djecijesobe()),format.raw/*90.75*/("""">Djecije sobe</a></li>
                            <li><a href=""""),_display_(/*91.43*/routes/*91.49*/.Application.spavacesobe()),format.raw/*91.75*/("""">Spavace sobe</a></li>
                            <li><a href=""""),_display_(/*92.43*/routes/*92.49*/.Application.predsoblja()),format.raw/*92.74*/("""">Predsoblja</a></li>
                            <li><a href=""""),_display_(/*93.43*/routes/*93.49*/.Application.kupatila()),format.raw/*93.72*/("""">Kupatila</a></li>
                        </ul>
                    </li>

                    <li><a href="services.html">Okov</a></li>
                    <li><a href=""""),_display_(/*98.35*/routes/*98.41*/.Application.gallery()),format.raw/*98.63*/("""">Galerija</a></li>
                    <li><a href=""""),_display_(/*99.35*/routes/*99.41*/.Application.contact()),format.raw/*99.63*/("""">Kontakt</a></li>
                </ul>
            </div>
                    </div>
            </div>
        </div>
    </header><!--/header-->


    <body>
        """),_display_(/*109.10*/content),format.raw/*109.17*/("""
    """),format.raw/*110.5*/("""</body>


    <section id="bottom" class="wet-asphalt">
        <div class="container">
            <div class="row">
                <div class="col-md-3 col-sm-6">
                    <h4>O nama</h4>
                    <p>Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Vestibulum tortor quam, feugiat vitae, ultricies eget, tempor sit amet, ante.</p>
                    <p>Pellentesque habitant morbi tristique senectus.</p>
                </div><!--/.col-md-3-->

                <div class="col-md-3 col-sm-6">
                    <h4>Company</h4>
                    <div>
                        <ul class="arrow">
                            <li><a href="#">Company Overview</a></li>
                            <li><a href="#">Meet The Team</a></li>
                            <li><a href="#">Our Awesome Partners</a></li>
                            <li><a href="#">Our Services</a></li>
                            <li><a href="#">Conatct Us</a></li>
                        </ul>
                    </div>
                </div><!--/.col-md-3-->



                <div class="col-md-3 col-sm-6">
                    <h4>Adresa</h4>
                    <address>
                        <strong>Sarajevo</strong><br>
                        Hamdije Cemerlica, 7<br>
                        Bosnia and Herzegovina<br>
                        Phone:  (061) 957-000
                    </address>

                </div> <!--/.col-md-3-->
                <div class="col-md-3 col-sm-6">
                    <h4>Posjetite nas</h4>
                    <a  href="https://www.facebook.com/Studio-Enterijer-Mirza-Granulo-497101773805091/?fref=nf">
                        <i class="icon-facebook icon-mde"></i>
                    </a>
                    <a class="left-margin" href="http://instagram.com/studioenterijer">
                        <i class="icon-instagram icon-mde"></i>
                    </a>
                </div>

            </div>
        </div>
    </section><!--/#bottom-->

    <footer id="footer" class="midnight-blue">
        <div class="container">
            <div class="row">
                <div class="col-sm-6">
                        &copy; 2015 . All Rights Reserved.
                </div>

                <div class="col-sm-6">
                    <ul class="pull-right">
                        <li><a href="#">Pocetna</a></li>
                        <li><a href="#">O nama</a></li>
                        <li><a href=""""),_display_(/*172.39*/routes/*172.45*/.Application.contact()),format.raw/*172.67*/("""">Kontakt </a></li>
                        <li><a id="gototop" class="gototop" href="#"><i class="icon-chevron-up"></i></a></li><!--#gototop-->
                    </ul>
                </div>

            </div>
        </div>
    </footer><!--/#footer-->
</html>
"""))
      }
    }
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}


}
}

/**/
object main extends main_Scope0.main_Scope1.main
              /*
                  -- GENERATED --
                  DATE: Thu Dec 24 13:17:36 CET 2015
                  SOURCE: C:/Users/ajla/Documents/DTProjects/enterijer/app/views/main.scala.html
                  HASH: 207d2f9685be545c6a9648255d3f7406f9d3b83b
                  MATRIX: 791->19|916->49|944->51|1237->317|1263->322|1383->415|1398->421|1470->471|1556->530|1571->536|1646->589|1730->646|1745->652|1815->700|1899->757|1914->763|1980->807|2064->864|2079->870|2142->911|2197->939|2212->945|2278->990|2369->1054|2384->1060|2450->1105|2535->1163|2550->1169|2618->1216|2703->1274|2718->1280|2781->1322|2866->1380|2881->1386|2951->1435|3036->1493|3051->1499|3126->1553|3211->1611|3226->1617|3287->1657|3362->1815|3403->1829|3521->1920|3536->1926|3613->1982|3751->2093|3766->2099|3830->2142|3933->2218|3948->2224|4013->2267|4116->2343|4131->2349|4196->2392|4297->2466|4312->2472|4377->2515|4464->2575|4479->2581|4544->2624|5238->3291|5253->3297|5294->3317|5334->3330|5349->3336|5407->3372|5931->3869|5946->3875|5988->3896|6076->3957|6091->3963|6137->3988|6230->4054|6245->4060|6291->4085|6384->4151|6399->4157|6438->4175|6523->4233|6538->4239|6584->4264|6677->4330|6692->4336|6742->4365|6839->4435|6854->4441|6903->4469|7293->4832|7308->4838|7351->4860|7440->4922|7455->4928|7498->4950|7587->5012|7602->5018|7650->5045|7755->5123|7770->5129|7816->5154|7909->5220|7924->5226|7971->5252|8065->5319|8080->5325|8127->5351|8221->5418|8236->5424|8282->5449|8374->5514|8389->5520|8433->5543|8638->5721|8653->5727|8696->5749|8778->5804|8793->5810|8836->5832|9045->6013|9074->6020|9108->6026|11720->8610|11736->8616|11780->8638
                  LINES: 30->2|35->2|36->3|45->12|45->12|48->15|48->15|48->15|50->17|50->17|50->17|51->18|51->18|51->18|52->19|52->19|52->19|53->20|53->20|53->20|55->22|55->22|55->22|59->26|59->26|59->26|60->27|60->27|60->27|61->28|61->28|61->28|62->29|62->29|62->29|63->30|63->30|63->30|64->31|64->31|64->31|66->33|69->36|72->39|72->39|72->39|77->44|77->44|77->44|78->45|78->45|78->45|79->46|79->46|79->46|80->47|80->47|80->47|81->48|81->48|81->48|96->63|96->63|96->63|96->63|96->63|96->63|106->73|106->73|106->73|107->74|107->74|107->74|108->75|108->75|108->75|109->76|109->76|109->76|110->77|110->77|110->77|111->78|111->78|111->78|112->79|112->79|112->79|119->86|119->86|119->86|120->87|120->87|120->87|121->88|121->88|121->88|122->89|122->89|122->89|123->90|123->90|123->90|124->91|124->91|124->91|125->92|125->92|125->92|126->93|126->93|126->93|131->98|131->98|131->98|132->99|132->99|132->99|142->109|142->109|143->110|205->172|205->172|205->172
                  -- GENERATED --
              */
          