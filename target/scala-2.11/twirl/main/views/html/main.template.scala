
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._

import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._

/**/
object main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.32*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>

<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>"""),_display_(/*10.17*/title),format.raw/*10.22*/("""</title>
        <link rel="stylesheet" media="screen" href=""""),_display_(/*11.54*/routes/*11.60*/.Assets.at("stylesheets/bootstrap.min.css")),format.raw/*11.103*/("""">
        <link rel="stylesheet" href=""""),_display_(/*12.39*/routes/*12.45*/.Assets.at("stylesheets/dashboard.css")),format.raw/*12.84*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*13.59*/routes/*13.65*/.Assets.at("images/favicon.png")),format.raw/*13.97*/("""">
    </head>
    <body>
        <nav class="navbar navbar-inverse navbar-fixed-top">
          <div class="container-fluid">
            <div class="navbar-header">
              <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
              </button>
              <a class="navbar-brand" href="#">Jefferson Project</a>
            </div>
            <div id="navbar" class="navbar-collapse collapse">
              <ul class="nav navbar-nav">
                <li><a href=""""),_display_(/*29.31*/routes/*29.37*/.Application.index()),format.raw/*29.57*/("""">Faceted Search</a></li>
                <li><a href=""""),_display_(/*30.31*/routes/*30.37*/.Spatial.index()),format.raw/*30.53*/("""">Spatial Search</a></li>
                <li><a href=""""),_display_(/*31.31*/routes/*31.37*/.Hierarchy.index()),format.raw/*31.55*/("""">Metadata Browser</a></li>
              </ul>

			 
              <form class="navbar-form navbar-right" action="/login" method="post">
            		<div class="form-group">
              			<input type="text" name="username" placeholder="Username" class="form-control">
            		</div>
            		<div class="form-group">
              			<input type="password" name="password" placeholder="Password" class="form-control">
            		</div>
            		<button type="submit" class="btn btn-success">Sign in</button>
          	  </form>
            </div>
          </div>
        </nav>

        """),_display_(/*48.10*/content),format.raw/*48.17*/("""
        """),format.raw/*49.9*/("""<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
        <script src=""""),_display_(/*51.23*/routes/*51.29*/.Assets.at("javascripts/bootstrap.min.js")),format.raw/*51.71*/(""""></script>
        <script src="../../assets/js/ie10-viewport-bug-workaround.js"></script>
    </body>
</html>
"""))}
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Jun 23 19:17:13 EDT 2015
                  SOURCE: /Users/paulopinheiro/Documents/workspace/metadata-browser/app/views/main.scala.html
                  HASH: 6d158c426b7ba5bebed8dd301efbf9ce15589d85
                  MATRIX: 727->1|845->31|873->33|1121->254|1147->259|1236->321|1251->327|1316->370|1384->411|1399->417|1459->456|1547->517|1562->523|1615->555|2419->1332|2434->1338|2475->1358|2558->1414|2573->1420|2610->1436|2693->1492|2708->1498|2747->1516|3389->2131|3417->2138|3453->2147|3663->2330|3678->2336|3741->2378
                  LINES: 26->1|29->1|31->3|38->10|38->10|39->11|39->11|39->11|40->12|40->12|40->12|41->13|41->13|41->13|57->29|57->29|57->29|58->30|58->30|58->30|59->31|59->31|59->31|76->48|76->48|77->49|79->51|79->51|79->51
                  -- GENERATED --
              */
          