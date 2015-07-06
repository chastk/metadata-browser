
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
object detector_entry extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[models.TripleDocument,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(triple : models.TripleDocument):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.34*/("""

"""),_display_(/*3.2*/defining(triple.get("sn"))/*3.28*/ {itemID =>_display_(Seq[Any](format.raw/*3.39*/("""
"""),format.raw/*4.1*/("""<div class="panel panel-default">
    <div class="panel-heading" role="tab" id="heading"""),_display_(/*5.55*/itemID),format.raw/*5.61*/("""">
        <h4 class="panel-title">
            <a class="collapsed" role="button" data-toggle="collapse" data-parent="#accordion" href="#"""),_display_(/*7.104*/itemID),format.raw/*7.110*/("""" aria-expanded="false" aria-controls=""""),_display_(/*7.150*/itemID),format.raw/*7.156*/("""">
                """),_display_(/*8.18*/triple/*8.24*/.get("detName")),format.raw/*8.39*/("""</a></h4>
            
    </div>
    <div id=""""),_display_(/*11.15*/itemID),format.raw/*11.21*/("""" class="panel-collapse collapse" role="tabpanel" aria-labelledby="heading"""),_display_(/*11.96*/itemID),format.raw/*11.102*/("""">
        <div class="panel-body">
            <p><b>"""),_display_(/*13.20*/triple/*13.26*/.get("detName")),format.raw/*13.41*/(""" """),format.raw/*13.42*/("""</b> (type: """),_display_(/*13.55*/triple/*13.61*/.get("detModelName")),format.raw/*13.81*/(""" """),format.raw/*13.82*/(""")</p>
            <p>serial number """),_display_(/*14.31*/itemID),format.raw/*14.37*/("""</p>
        </div>
    </div>
</div>
""")))}))}
  }

  def render(triple:models.TripleDocument): play.twirl.api.HtmlFormat.Appendable = apply(triple)

  def f:((models.TripleDocument) => play.twirl.api.HtmlFormat.Appendable) = (triple) => apply(triple)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Thu Jul 02 17:34:36 EDT 2015
                  SOURCE: /home/tetherless/metadata-browser/app/views/detector_entry.scala.html
                  HASH: 05798c3ab9d11091f59c65228f2dec71b4d49b0c
                  MATRIX: 747->1|867->33|895->36|929->62|977->73|1004->74|1118->162|1144->168|1310->307|1337->313|1404->353|1431->359|1477->379|1491->385|1526->400|1601->448|1628->454|1730->529|1758->535|1840->590|1855->596|1891->611|1920->612|1960->625|1975->631|2016->651|2045->652|2108->688|2135->694
                  LINES: 26->1|29->1|31->3|31->3|31->3|32->4|33->5|33->5|35->7|35->7|35->7|35->7|36->8|36->8|36->8|39->11|39->11|39->11|39->11|41->13|41->13|41->13|41->13|41->13|41->13|41->13|41->13|42->14|42->14
                  -- GENERATED --
              */
          