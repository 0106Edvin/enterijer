
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


        <script src='"""),_display_(/*25.23*/routes/*25.29*/.Assets.versioned("javascripts/html5shiv.js")),format.raw/*25.74*/("""' type="text/javascript"></script>
        <script src='"""),_display_(/*26.23*/routes/*26.29*/.Assets.versioned("javascripts/respond.min.js")),format.raw/*26.76*/("""' type="text/javascript"></script>
        <script src='"""),_display_(/*27.23*/routes/*27.29*/.Assets.versioned("javascripts/jquery.js")),format.raw/*27.71*/("""' type="text/javascript"></script>
        <script src='"""),_display_(/*28.23*/routes/*28.29*/.Assets.versioned("javascripts/jquery.isotope.min.js")),format.raw/*28.83*/("""' type="text/javascript"></script>
        <script src='"""),_display_(/*29.23*/routes/*29.29*/.Assets.versioned("javascripts/jquery.prettyPhoto.js")),format.raw/*29.83*/("""' type="text/javascript"></script>
        <script src='"""),_display_(/*30.23*/routes/*30.29*/.Assets.versioned("javascripts/bootstrap.min.js")),format.raw/*30.78*/("""' type="text/javascript"></script>

        <script src='"""),_display_(/*32.23*/routes/*32.29*/.Assets.versioned("javascripts/main.js")),format.raw/*32.69*/("""' type="text/javascript"></script>

        <script src="https://maps.googleapis.com/maps/api/js"></script>

        <script src='"""),_display_(/*36.23*/routes/*36.29*/.Assets.versioned("javascripts/jQuerry.easyPaginate.js")),format.raw/*36.85*/("""'></script>


            <!--[if lt IE 9]>
            <![endif]-->
        <link rel="shortcut icon" href="images/favicon.png">
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
                <a class="navbar-brand" href=""""),_display_(/*58.48*/routes/*58.54*/.Application.index()),format.raw/*58.74*/(""""><img src='"""),_display_(/*58.87*/routes/*58.93*/.Assets.versioned("images/logo.png")),format.raw/*58.129*/("""' alt="logo"></a>
            </div>
            <div class="collapse navbar-collapse">
                <ul class="nav navbar-nav navbar-right">
                    <li><a href=""""),_display_(/*62.35*/routes/*62.41*/.Application.gallery()),format.raw/*62.63*/("""">Gallery</a></li>
                    <li><a href=""""),_display_(/*63.35*/routes/*63.41*/.Application.contact()),format.raw/*63.63*/("""">Contact</a></li>
                    <li><a href="services.html">Okov</a></li>
                    <li class="dropdown">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown">Plocasti materijali <i class="icon-angle-down"></i></a>
                        <ul class="dropdown-menu">
                            <li><a href=""""),_display_(/*68.43*/routes/*68.49*/.Application.univer()),format.raw/*68.70*/("""">Univer</a></li>
                            <li><a href=""""),_display_(/*69.43*/routes/*69.49*/.Application.radneploce()),format.raw/*69.74*/("""">Radne ploce</a></li>
                            <li><a href=""""),_display_(/*70.43*/routes/*70.49*/.Application.mdffarbani()),format.raw/*70.74*/("""">MDF Farbani</a></li>
                            <li><a href=""""),_display_(/*71.43*/routes/*71.49*/.Application.mdf()),format.raw/*71.67*/("""">MDF</a></li>
                            <li><a href=""""),_display_(/*72.43*/routes/*72.49*/.Application.hdflesonit()),format.raw/*72.74*/("""">HDF Lesonit</a></li>
                            <li><a href=""""),_display_(/*73.43*/routes/*73.49*/.Application.furniraneploce()),format.raw/*73.78*/("""">Furnirane ploce</a></li>
                            <li><a href=""""),_display_(/*74.43*/routes/*74.49*/.Application.ivericasirova()),format.raw/*74.77*/("""">Iverica sirova</a></li>
                        </ul>
                    </li>

                    <li class="dropdown">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown">Namjestaj po mjeri <i class="icon-angle-down"></i></a>
                        <ul class="dropdown-menu">
                            <li><a href=""""),_display_(/*81.43*/routes/*81.49*/.Application.kuhinje()),format.raw/*81.71*/("""">Kuhinje</a></li>
                            <li><a href=""""),_display_(/*82.43*/routes/*82.49*/.Application.plakari()),format.raw/*82.71*/("""">Plakari</a></li>
                            <li><a href=""""),_display_(/*83.43*/routes/*83.49*/.Application.kannamjestaj()),format.raw/*83.76*/("""">Kancelarijski namjestaj</a></li>
                            <li><a href=""""),_display_(/*84.43*/routes/*84.49*/.Application.dnevnesobe()),format.raw/*84.74*/("""">Dnevne sobe</a></li>
                            <li><a href=""""),_display_(/*85.43*/routes/*85.49*/.Application.djecijesobe()),format.raw/*85.75*/("""">Djecije sobe</a></li>
                            <li><a href=""""),_display_(/*86.43*/routes/*86.49*/.Application.spavacesobe()),format.raw/*86.75*/("""">Spavace sobe</a></li>
                            <li><a href=""""),_display_(/*87.43*/routes/*87.49*/.Application.predsoblja()),format.raw/*87.74*/("""">Predsoblja</a></li>
                            <li><a href=""""),_display_(/*88.43*/routes/*88.49*/.Application.kupatila()),format.raw/*88.72*/("""">Kupatila</a></li>
                        </ul>
                    </li>
                </ul>
            </div>
        </div>
    </header><!--/header-->


    <body>
        """),_display_(/*98.10*/content),format.raw/*98.17*/("""
    """),format.raw/*99.5*/("""</body>


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
                        <li><a href=""""),_display_(/*162.39*/routes/*162.45*/.Application.contact()),format.raw/*162.67*/("""">Contact </a></li>
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
                  DATE: Thu Dec 17 22:44:14 CET 2015
                  SOURCE: E:/New Project/blankProject/app/views/main.scala.html
                  HASH: eb3ae7ad44ca80d7787ffd85e958fca340bbeb91
                  MATRIX: 791->19|916->49|944->51|1237->317|1263->322|1383->415|1398->421|1470->471|1556->530|1571->536|1646->589|1730->646|1745->652|1815->700|1899->757|1914->763|1980->807|2064->864|2079->870|2142->911|2197->939|2212->945|2278->990|2367->1052|2382->1058|2448->1103|2533->1161|2548->1167|2616->1214|2701->1272|2716->1278|2779->1320|2864->1378|2879->1384|2954->1438|3039->1496|3054->1502|3129->1556|3214->1614|3229->1620|3299->1669|3386->1729|3401->1735|3462->1775|3624->1910|3639->1916|3716->1972|4939->3168|4954->3174|4995->3194|5035->3207|5050->3213|5108->3249|5318->3432|5333->3438|5376->3460|5457->3514|5472->3520|5515->3542|5902->3902|5917->3908|5959->3929|6047->3990|6062->3996|6108->4021|6201->4087|6216->4093|6262->4118|6355->4184|6370->4190|6409->4208|6494->4266|6509->4272|6555->4297|6648->4363|6663->4369|6713->4398|6810->4468|6825->4474|6874->4502|7264->4865|7279->4871|7322->4893|7411->4955|7426->4961|7469->4983|7558->5045|7573->5051|7621->5078|7726->5156|7741->5162|7787->5187|7880->5253|7895->5259|7942->5285|8036->5352|8051->5358|8098->5384|8192->5451|8207->5457|8253->5482|8345->5547|8360->5553|8404->5576|8623->5768|8651->5775|8684->5781|11292->8361|11308->8367|11352->8389
                  LINES: 30->2|35->2|36->3|45->12|45->12|48->15|48->15|48->15|50->17|50->17|50->17|51->18|51->18|51->18|52->19|52->19|52->19|53->20|53->20|53->20|55->22|55->22|55->22|58->25|58->25|58->25|59->26|59->26|59->26|60->27|60->27|60->27|61->28|61->28|61->28|62->29|62->29|62->29|63->30|63->30|63->30|65->32|65->32|65->32|69->36|69->36|69->36|91->58|91->58|91->58|91->58|91->58|91->58|95->62|95->62|95->62|96->63|96->63|96->63|101->68|101->68|101->68|102->69|102->69|102->69|103->70|103->70|103->70|104->71|104->71|104->71|105->72|105->72|105->72|106->73|106->73|106->73|107->74|107->74|107->74|114->81|114->81|114->81|115->82|115->82|115->82|116->83|116->83|116->83|117->84|117->84|117->84|118->85|118->85|118->85|119->86|119->86|119->86|120->87|120->87|120->87|121->88|121->88|121->88|131->98|131->98|132->99|195->162|195->162|195->162
                  -- GENERATED --
              */
          