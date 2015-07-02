
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
object instrument_entry extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[models.TripleDocument,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(triple : models.TripleDocument):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.34*/("""

"""),_display_(/*3.2*/defining(triple.get("sn"))/*3.28*/ {itemID =>_display_(Seq[Any](format.raw/*3.39*/("""
"""),format.raw/*4.1*/("""<div class="panel-heading" role="tab" id="heading"""),_display_(/*4.51*/itemID),format.raw/*4.57*/("""">
    <h4 class="panel-title">
        <a class="collapsed" role="button" data-toggle="collapse" data-parent="#accordion" href="#"""),_display_(/*6.100*/itemID),format.raw/*6.106*/("""" aria-expanded="false" aria-controls=""""),_display_(/*6.146*/itemID),format.raw/*6.152*/("""">
            """),_display_(/*7.14*/triple/*7.20*/.get("instName")),format.raw/*7.36*/("""</a></h4>
        
</div>
<div id=""""),_display_(/*10.11*/itemID),format.raw/*10.17*/("""" class="panel-collapse collapse" role="tabpanel" aria-labelledby="heading"""),_display_(/*10.92*/itemID),format.raw/*10.98*/("""">
    <div class="panel-body">
        <p><b>"""),_display_(/*12.16*/triple/*12.22*/.get("instName")),format.raw/*12.38*/(""" """),format.raw/*12.39*/("""</b> (type: """),_display_(/*12.52*/triple/*12.58*/.get("instModelName")),format.raw/*12.79*/(""" """),format.raw/*12.80*/(""")</p>
        <p>serial number """),_display_(/*13.27*/itemID),format.raw/*13.33*/("""</p>
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
                  DATE: Wed Jul 01 19:18:33 EDT 2015
                  SOURCE: /home/tetherless/metadata-browser/app/views/instrument_entry.scala.html
                  HASH: 63a26d6b8384a1185939d1792fb1b984c3c1520e
                  MATRIX: 749->1|869->33|897->36|931->62|979->73|1006->74|1082->124|1108->130|1266->261|1293->267|1360->307|1387->313|1429->329|1443->335|1479->351|1542->387|1569->393|1671->468|1698->474|1772->521|1787->527|1824->543|1853->544|1893->557|1908->563|1950->584|1979->585|2038->617|2065->623
                  LINES: 26->1|29->1|31->3|31->3|31->3|32->4|32->4|32->4|34->6|34->6|34->6|34->6|35->7|35->7|35->7|38->10|38->10|38->10|38->10|40->12|40->12|40->12|40->12|40->12|40->12|40->12|40->12|41->13|41->13
                  -- GENERATED --
              */
          