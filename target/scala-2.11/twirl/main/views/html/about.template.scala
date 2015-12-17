
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object about_Scope0 {
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

class about extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*1.2*/main("Studio Enterijer")/*1.26*/{_display_(Seq[Any](format.raw/*1.27*/("""

      """),format.raw/*3.7*/("""<section id="bottom" class="wet-asphalt">
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
object about extends about_Scope0.about
              /*
                  -- GENERATED --
                  DATE: Tue Dec 15 22:37:38 CET 2015
                  SOURCE: E:/New Project/blankProject/app/views/about.scala.html
                  HASH: ec7144834ecba8aacfc5cccc69f8f2f1441ad899
                  MATRIX: 827->1|859->25|897->26|933->36
                  LINES: 32->1|32->1|32->1|34->3
                  -- GENERATED --
              */
          