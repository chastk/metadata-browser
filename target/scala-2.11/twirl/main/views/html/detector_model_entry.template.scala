
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
object detector_model_entry extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[models.TripleDocument,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(triple : models.TripleDocument):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.34*/("""

"""),_display_(/*3.2*/defining(triple.generateID())/*3.31*/ {itemID =>_display_(Seq[Any](format.raw/*3.42*/("""
"""),format.raw/*4.1*/("""<div class="panel-heading" role="tab" id="heading"""),_display_(/*4.51*/itemID),format.raw/*4.57*/("""">
    <h4 class="panel-title">
        <a class="collapsed" role="button" data-toggle="collapse" data-parent="#accordion" href="#"""),_display_(/*6.100*/itemID),format.raw/*6.106*/("""" aria-expanded="false" aria-controls=""""),_display_(/*6.146*/itemID),format.raw/*6.152*/("""">
            """),_display_(/*7.14*/triple/*7.20*/.get("detModelName")),format.raw/*7.40*/("""</a></h4>
        
</div>
<div id=""""),_display_(/*10.11*/itemID),format.raw/*10.17*/("""" class="panel-collapse collapse" role="tabpanel" aria-labelledby="heading"""),_display_(/*10.92*/itemID),format.raw/*10.98*/("""">
    <div class="panel-body">
        <p><b>"""),_display_(/*12.16*/triple/*12.22*/.get("detModelName")),format.raw/*12.42*/(""" """),format.raw/*12.43*/("""</b> (manufactured by: """),_display_(/*12.67*/triple/*12.73*/.get("maker")),format.raw/*12.86*/(""" """),format.raw/*12.87*/(""")</p>
        <p>For measuring """),_display_(/*13.27*/triple/*13.33*/.get("chara")),format.raw/*13.46*/("""</p>
        <p>Description: """),_display_(/*14.26*/triple/*14.32*/.get("desc")),format.raw/*14.44*/("""</p>
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
                  DATE: Thu Jul 02 12:57:31 EDT 2015
                  SOURCE: /home/tetherless/metadata-browser/app/views/detector_model_entry.scala.html
                  HASH: a7b66fe165f84cbf0a6608904567ed8b75647321
                  MATRIX: 753->1|873->33|901->36|938->65|986->76|1013->77|1089->127|1115->133|1273->264|1300->270|1367->310|1394->316|1436->332|1450->338|1490->358|1553->394|1580->400|1682->475|1709->481|1783->528|1798->534|1839->554|1868->555|1919->579|1934->585|1968->598|1997->599|2056->631|2071->637|2105->650|2162->680|2177->686|2210->698
                  LINES: 26->1|29->1|31->3|31->3|31->3|32->4|32->4|32->4|34->6|34->6|34->6|34->6|35->7|35->7|35->7|38->10|38->10|38->10|38->10|40->12|40->12|40->12|40->12|40->12|40->12|40->12|40->12|41->13|41->13|41->13|42->14|42->14|42->14
                  -- GENERATED --
              */
          