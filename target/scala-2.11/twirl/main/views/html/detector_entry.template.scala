
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
"""),format.raw/*4.1*/("""<div class="panel-heading" role="tab" id="heading"""),_display_(/*4.51*/itemID),format.raw/*4.57*/("""">
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
                  DATE: Tue Jun 30 18:23:49 EDT 2015
                  SOURCE: /home/oneironym/jp/metadata-browser/app/views/detector_entry.scala.html
                  HASH: ed89ad4164a8d93760e33b3230705a676e971cee
                  MATRIX: 747->1|867->33|895->36|929->62|977->73|1004->74|1080->124|1106->130|1264->261|1291->267|1358->307|1385->313|1427->329|1441->335|1476->350|1539->386|1566->392|1668->467|1695->473|1769->520|1784->526|1820->541|1849->542|1889->555|1904->561|1945->581|1974->582|2033->614|2060->620
                  LINES: 26->1|29->1|31->3|31->3|31->3|32->4|32->4|32->4|34->6|34->6|34->6|34->6|35->7|35->7|35->7|38->10|38->10|38->10|38->10|40->12|40->12|40->12|40->12|40->12|40->12|40->12|40->12|41->13|41->13
                  -- GENERATED --
              */
          