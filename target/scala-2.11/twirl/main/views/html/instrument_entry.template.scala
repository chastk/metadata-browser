
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
"""),format.raw/*4.1*/("""<div class="panel-heading" role="tab" id="headingOne">
    <h4 class="panel-title">
        <a class="collapsed" role="button" data-toggle="collapse" data-parent="#accordion" href="#"""),_display_(/*6.100*/itemID),format.raw/*6.106*/("""" aria-expanded="false" aria-controls=""""),_display_(/*6.146*/itemID),format.raw/*6.152*/("""">
            """),_display_(/*7.14*/triple/*7.20*/.get("detName")),format.raw/*7.35*/("""</a></h4>
        
</div>
<div id=""""),_display_(/*10.11*/itemID),format.raw/*10.17*/("""" class="panel-collapse collapse" role="tabpanel" aria-labelledby="heading"""),_display_(/*10.92*/itemID),format.raw/*10.98*/("""">
    <div class="panel-body">
        <p><b>"""),_display_(/*12.16*/triple/*12.22*/.get("detName")),format.raw/*12.37*/(""" """),format.raw/*12.38*/("""</b> (type: """),_display_(/*12.51*/triple/*12.57*/.get("detModelName")),format.raw/*12.77*/(""" """),format.raw/*12.78*/(""")</p>
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
                  DATE: Fri Jun 26 20:22:34 EDT 2015
                  SOURCE: /home/oneironym/jp/metadata-browser/app/views/instrument_entry.scala.html
                  HASH: 0432c6e3349296357cf254abe9e68c7b5f520ced
                  MATRIX: 749->1|869->33|897->36|931->62|979->73|1006->74|1216->257|1243->263|1310->303|1337->309|1379->325|1393->331|1428->346|1491->382|1518->388|1620->463|1647->469|1721->516|1736->522|1772->537|1801->538|1841->551|1856->557|1897->577|1926->578|1985->610|2012->616
                  LINES: 26->1|29->1|31->3|31->3|31->3|32->4|34->6|34->6|34->6|34->6|35->7|35->7|35->7|38->10|38->10|38->10|38->10|40->12|40->12|40->12|40->12|40->12|40->12|40->12|40->12|41->13|41->13
                  -- GENERATED --
              */
          