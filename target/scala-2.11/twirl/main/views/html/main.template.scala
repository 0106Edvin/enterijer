
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

<html lang="en-BA">
    <head>
        <title>"""),_display_(/*7.17*/title),format.raw/*7.22*/("""</title>
        <link rel="stylesheet" media="screen" href='"""),_display_(/*8.54*/routes/*8.60*/.Assets.versioned("stylesheets/main.css")),format.raw/*8.101*/("""'>

        <!-- Bootstrap -->
        <link rel="stylesheet" media="screen" href='"""),_display_(/*11.54*/routes/*11.60*/.Assets.versioned("stylesheets/bootstrap.min.css")),format.raw/*11.110*/("""'>

        <link rel="stylesheet" media="screen" href='"""),_display_(/*13.54*/routes/*13.60*/.Assets.versioned("stylesheets/font-awesome.min.css")),format.raw/*13.113*/("""'>
        <link rel="stylesheet" media="screen" href='"""),_display_(/*14.54*/routes/*14.60*/.Assets.versioned("stylesheets/prettyPhoto.css")),format.raw/*14.108*/("""'>
        <link rel="stylesheet" media="screen" href='"""),_display_(/*15.54*/routes/*15.60*/.Assets.versioned("stylesheets/animate.css")),format.raw/*15.104*/("""'>
        <link rel="stylesheet" media="screen" href='"""),_display_(/*16.54*/routes/*16.60*/.Assets.versioned("stylesheets/main.css")),format.raw/*16.101*/("""'>

        <script src='"""),_display_(/*18.23*/routes/*18.29*/.Assets.versioned("javascripts/bootstrap.js")),format.raw/*18.74*/("""' type="text/javascript"></script>


        <script src='"""),_display_(/*21.23*/routes/*21.29*/.Assets.versioned("javascripts/html5shiv.js")),format.raw/*21.74*/("""' type="text/javascript"></script>
        <script src='"""),_display_(/*22.23*/routes/*22.29*/.Assets.versioned("javascripts/respond.min.js")),format.raw/*22.76*/("""' type="text/javascript"></script>
        <script src='"""),_display_(/*23.23*/routes/*23.29*/.Assets.versioned("javascripts/jquery.js")),format.raw/*23.71*/("""' type="text/javascript"></script>
        <script src='"""),_display_(/*24.23*/routes/*24.29*/.Assets.versioned("javascripts/jquery.isotope.min.js")),format.raw/*24.83*/("""' type="text/javascript"></script>
        <script src='"""),_display_(/*25.23*/routes/*25.29*/.Assets.versioned("javascripts/jquery.prettyPhoto.js")),format.raw/*25.83*/("""' type="text/javascript"></script>
        <script src='"""),_display_(/*26.23*/routes/*26.29*/.Assets.versioned("javascripts/bootstrap.min.js")),format.raw/*26.78*/("""' type="text/javascript"></script>

        <script src='"""),_display_(/*28.23*/routes/*28.29*/.Assets.versioned("javascripts/main.js")),format.raw/*28.69*/("""' type="text/javascript"></script>

        <script src="https://maps.googleapis.com/maps/api/js"></script>

        <script src='"""),_display_(/*32.23*/routes/*32.29*/.Assets.versioned("javascripts/jQuerry.easyPaginate.js")),format.raw/*32.85*/("""'></script>

        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="description" content="">
        <meta name="author" content="">

            <!--[if lt IE 9]>
            <![endif]-->
        <link rel="shortcut icon" href="images/ico/favicon.ico">
        <link rel="apple-touch-icon-precomposed" sizes="144x144" href="images/ico/apple-touch-icon-144-precomposed.png">
        <link rel="apple-touch-icon-precomposed" sizes="114x114" href="images/ico/apple-touch-icon-114-precomposed.png">
        <link rel="apple-touch-icon-precomposed" sizes="72x72" href="images/ico/apple-touch-icon-72-precomposed.png">
        <link rel="apple-touch-icon-precomposed" href="images/ico/apple-touch-icon-57-precomposed.png">
    </head>


    <header class="navbar navbar-inverse navbar-fixed-top wet-asphalt" role="banner">
        <div class="container">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href=""""),_display_(/*57.48*/routes/*57.54*/.Application.index()),format.raw/*57.74*/(""""><img src='' alt="logo"></a>
            </div>
            <div class="collapse navbar-collapse">
                <ul class="nav navbar-nav navbar-right">
                    <li class="active"><a href=""""),_display_(/*61.50*/routes/*61.56*/.Application.index()),format.raw/*61.76*/("""">Home</a></li>
                    <li><a href="about-us.html">About Us</a></li>
                    <li><a href="services.html">Services</a></li>
                    <li><a href=""""),_display_(/*64.35*/routes/*64.41*/.Application.gallery()),format.raw/*64.63*/("""">Gallery</a></li>
                    <li><a href=""""),_display_(/*65.35*/routes/*65.41*/.Application.contact()),format.raw/*65.63*/("""">Contact</a></li>
                </ul>
            </div>
        </div>
    </header><!--/header-->


    <body>
        """),_display_(/*73.10*/content),format.raw/*73.17*/("""
    """),format.raw/*74.5*/("""</body>


    <section id="bottom" class="wet-asphalt">
        <div class="container">
            <div class="row">
                <div class="col-md-3 col-sm-6">
                    <h4>About Us</h4>
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
                    <h4>Address</h4>
                    <address>
                        <strong>Sarajevo</strong><br>
                        Hamdije Cemerlica, 7<br>
                        Bosnia and Herzegovina<br>
                        Phone:  (061) 957-000
                    </address>

                </div> <!--/.col-md-3-->
                <div class="col-md-3 col-sm-6">
                    <h4>Visit us</h4>
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
                        <li><a href="#">Home</a></li>
                        <li><a href="#">About</a></li>
                        <li><a href=""""),_display_(/*137.39*/routes/*137.45*/.Application.contact()),format.raw/*137.67*/("""">Contact </a></li>
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
                  DATE: Wed Dec 16 14:50:04 CET 2015
                  SOURCE: E:/New Project/blankProject/app/views/main.scala.html
                  HASH: 7494c3ca887f443e4142fe5903e1a46bdcfdef20
                  MATRIX: 791->19|916->49|944->51|1038->119|1063->124|1152->187|1166->193|1228->234|1342->321|1357->327|1429->377|1515->436|1530->442|1605->495|1689->552|1704->558|1774->606|1858->663|1873->669|1939->713|2023->770|2038->776|2101->817|2156->845|2171->851|2237->896|2326->958|2341->964|2407->1009|2492->1067|2507->1073|2575->1120|2660->1178|2675->1184|2738->1226|2823->1284|2838->1290|2913->1344|2998->1402|3013->1408|3088->1462|3173->1520|3188->1526|3258->1575|3345->1635|3360->1641|3421->1681|3583->1816|3598->1822|3675->1878|5069->3245|5084->3251|5125->3271|5362->3481|5377->3487|5418->3507|5630->3692|5645->3698|5688->3720|5769->3774|5784->3780|5827->3802|5987->3935|6015->3942|6048->3948|8656->6528|8672->6534|8716->6556
                  LINES: 30->2|35->2|36->3|40->7|40->7|41->8|41->8|41->8|44->11|44->11|44->11|46->13|46->13|46->13|47->14|47->14|47->14|48->15|48->15|48->15|49->16|49->16|49->16|51->18|51->18|51->18|54->21|54->21|54->21|55->22|55->22|55->22|56->23|56->23|56->23|57->24|57->24|57->24|58->25|58->25|58->25|59->26|59->26|59->26|61->28|61->28|61->28|65->32|65->32|65->32|90->57|90->57|90->57|94->61|94->61|94->61|97->64|97->64|97->64|98->65|98->65|98->65|106->73|106->73|107->74|170->137|170->137|170->137
                  -- GENERATED --
              */
          