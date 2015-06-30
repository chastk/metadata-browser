
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
object instrument_model_entry extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[models.TripleDocument,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(triple : models.TripleDocument):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.34*/("""

"""),_display_(/*3.2*/defining(triple.generateID())/*3.31*/ {itemID =>_display_(Seq[Any](format.raw/*3.42*/("""
"""),format.raw/*4.1*/("""<div class="panel-heading" role="tab" id="heading"""),_display_(/*4.51*/itemID),format.raw/*4.57*/("""">
    <h4 class="panel-title">
        <a class="collapsed" role="button" data-toggle="collapse" data-parent="#accordion" href="#"""),_display_(/*6.100*/itemID),format.raw/*6.106*/("""" aria-expanded="false" aria-controls=""""),_display_(/*6.146*/itemID),format.raw/*6.152*/("""">
            """),_display_(/*7.14*/triple/*7.20*/.get("instModelName")),format.raw/*7.41*/("""</a></h4>
        
</div>
<div id=""""),_display_(/*10.11*/itemID),format.raw/*10.17*/("""" class="panel-collapse collapse" role="tabpanel" aria-labelledby="heading"""),_display_(/*10.92*/itemID),format.raw/*10.98*/("""">
    <div class="panel-body">
        <p><b>"""),_display_(/*12.16*/triple/*12.22*/.get("instModelName")),format.raw/*12.43*/(""" """),format.raw/*12.44*/("""</b> (manufactured by: """),_display_(/*12.68*/triple/*12.74*/.get("maker")),format.raw/*12.87*/(""" """),format.raw/*12.88*/(""")</p>
        <p>Description: """),_display_(/*13.26*/triple/*13.32*/.get("desc")),format.raw/*13.44*/("""</p>
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
                  DATE: Tue Jun 30 18:02:23 EDT 2015
                  SOURCE: /home/oneironym/jp/metadata-browser/app/views/instrument_model_entry.scala.html
                  HASH: afcae173d202f1e3c7e6af124e3a200f3445f10a
                  MATRIX: 755->1|875->33|903->36|940->65|988->76|1015->77|1091->127|1117->133|1275->264|1302->270|1369->310|1396->316|1438->332|1452->338|1493->359|1556->395|1583->401|1685->476|1712->482|1786->529|1801->535|1843->556|1872->557|1923->581|1938->587|1972->600|2001->601|2059->632|2074->638|2107->650
                  LINES: 26->1|29->1|31->3|31->3|31->3|32->4|32->4|32->4|34->6|34->6|34->6|34->6|35->7|35->7|35->7|38->10|38->10|38->10|38->10|40->12|40->12|40->12|40->12|40->12|40->12|40->12|40->12|41->13|41->13|41->13
                  -- GENERATED --
              */
          