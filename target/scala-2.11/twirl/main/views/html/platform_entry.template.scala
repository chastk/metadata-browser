
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
object platform_entry extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[models.TripleDocument,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(triple : models.TripleDocument):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.34*/("""

"""),_display_(/*3.2*/defining(triple.get("sn"))/*3.28*/ {itemID =>_display_(Seq[Any](format.raw/*3.39*/("""
"""),format.raw/*4.1*/("""<div class="panel-heading" role="tab" id="headingOne">
    <h4 class="panel-title">
        <a class="collapsed" role="button" data-toggle="collapse" data-parent="#accordion" href="#"""),_display_(/*6.100*/itemID),format.raw/*6.106*/("""" aria-expanded="false" aria-controls=""""),_display_(/*6.146*/itemID),format.raw/*6.152*/("""">
            """),_display_(/*7.14*/triple/*7.20*/.get("platName")),format.raw/*7.36*/("""</a></h4>
        
</div>
<div id=""""),_display_(/*10.11*/itemID),format.raw/*10.17*/("""" class="panel-collapse collapse" role="tabpanel" aria-labelledby="heading"""),_display_(/*10.92*/itemID),format.raw/*10.98*/("""">
    <div class="panel-body">
        <p><b>"""),_display_(/*12.16*/triple/*12.22*/.get("platName")),format.raw/*12.38*/(""" """),format.raw/*12.39*/("""</b> (type: """),_display_(/*12.52*/triple/*12.58*/.get("platModelName")),format.raw/*12.79*/(""" """),format.raw/*12.80*/(""")</p>
        <p>located at ("""),_display_(/*13.25*/triple/*13.31*/.get("lat")),format.raw/*13.42*/(""", """),_display_(/*13.45*/triple/*13.51*/.get("lng")),format.raw/*13.62*/(""") | serial number """),_display_(/*13.81*/itemID),format.raw/*13.87*/("""</p>
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
                  DATE: Fri Jun 26 20:01:20 EDT 2015
                  SOURCE: /home/oneironym/jp/metadata-browser/app/views/platform_entry.scala.html
                  HASH: cc346cdcd7b74b0132bd946510784903a486bc14
                  MATRIX: 747->1|867->33|895->36|929->62|977->73|1004->74|1214->257|1241->263|1308->303|1335->309|1377->325|1391->331|1427->347|1490->383|1517->389|1619->464|1646->470|1720->517|1735->523|1772->539|1801->540|1841->553|1856->559|1898->580|1927->581|1984->611|1999->617|2031->628|2061->631|2076->637|2108->648|2154->667|2181->673
                  LINES: 26->1|29->1|31->3|31->3|31->3|32->4|34->6|34->6|34->6|34->6|35->7|35->7|35->7|38->10|38->10|38->10|38->10|40->12|40->12|40->12|40->12|40->12|40->12|40->12|40->12|41->13|41->13|41->13|41->13|41->13|41->13|41->13|41->13
                  -- GENERATED --
              */
          