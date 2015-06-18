
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
object metadata_table extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[models.SparqlQueryResults,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(documentMap : models.SparqlQueryResults):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.43*/("""

    """),format.raw/*3.5*/("""<h2 class="sub-header">Results</h2>
    <div class="table-responsive">
        <table class="table table-striped">
            <thead>
              <tr>
                <th>Triples:</th>
              </tr>
            </thead>

            <tbody>
                """),_display_(/*13.18*/for(triple <- documentMap.triples_list) yield /*13.57*/ {_display_(Seq[Any](format.raw/*13.59*/("""
                """),format.raw/*14.17*/("""<tr>
                    """),_display_(/*15.22*/for((binding,uri) <- triple.items) yield /*15.56*/{_display_(Seq[Any](format.raw/*15.57*/("""
                    """),format.raw/*16.21*/("""<td>
                        <p>"""),_display_(/*17.29*/binding),format.raw/*17.36*/(""" """),format.raw/*17.37*/(""": """),_display_(/*17.40*/uri),format.raw/*17.43*/("""</p>
                    </td>
                    """)))}),format.raw/*19.22*/("""
                """),format.raw/*20.17*/("""</tr>
                """)))}),format.raw/*21.18*/("""
            """),format.raw/*22.13*/("""</tbody>

        </table>
    </div>"""))}
  }

  def render(documentMap:models.SparqlQueryResults): play.twirl.api.HtmlFormat.Appendable = apply(documentMap)

  def f:((models.SparqlQueryResults) => play.twirl.api.HtmlFormat.Appendable) = (documentMap) => apply(documentMap)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Wed Jun 17 23:33:13 EDT 2015
                  SOURCE: /home/oneironym/jp/metadata-browser/app/views/metadata_table.scala.html
                  HASH: 64015cefe28989b2214015c1a27e27c87aace1ca
                  MATRIX: 751->1|880->42|912->48|1206->315|1261->354|1301->356|1346->373|1399->399|1449->433|1488->434|1537->455|1597->488|1625->495|1654->496|1684->499|1708->502|1791->554|1836->571|1890->594|1931->607
                  LINES: 26->1|29->1|31->3|41->13|41->13|41->13|42->14|43->15|43->15|43->15|44->16|45->17|45->17|45->17|45->17|45->17|47->19|48->20|49->21|50->22
                  -- GENERATED --
              */
          