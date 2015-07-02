
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
object hierarchy_faceting extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[Map[String, models.SparqlQueryResults],Map[String, String],String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/( documentMap : Map[String, models.SparqlQueryResults],
   documentHierarchy: Map[String, String],
   final_query : String):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import helper._
import play.api.libs.json._

Seq[Any](format.raw/*3.25*/("""

"""),format.raw/*7.1*/("""
"""),_display_(/*8.2*/main("Hierarchy Faceted Search")/*8.34*/ {_display_(Seq[Any](format.raw/*8.36*/("""
    """),format.raw/*9.5*/("""<link rel="stylesheet" type="text/css" href='"""),_display_(/*9.51*/routes/*9.57*/.Assets.at("stylesheets/main.css")),format.raw/*9.91*/("""'>
    <div class="container-fluid">
      
      <div class="row">
        <div class="col-sm-9 col-md-10 main">
          <h1 class="page-header">Metadata Browser</h1>
		  <h4>"""),_display_(/*15.10*/final_query),format.raw/*15.21*/("""</h4>
		  <div class="row placeholders"></div>
		  <ul class="nav nav-tabs">
		    """),_display_(/*18.8*/for((thingType, query_results) <- documentMap) yield /*18.54*/ {_display_(Seq[Any](format.raw/*18.56*/("""
    		    """),format.raw/*19.11*/("""<li><a data-toggle="tab" href="#"""),_display_(/*19.44*/thingType),format.raw/*19.53*/("""">"""),_display_(/*19.56*/thingType),format.raw/*19.65*/("""</a></li>
		    """)))}),format.raw/*20.8*/("""
		    """),_display_(/*21.8*/for((thingType, hierarchy_results) <- documentHierarchy) yield /*21.64*/ {_display_(Seq[Any](format.raw/*21.66*/("""
    		    """),format.raw/*22.11*/("""<li><a data-toggle="tab" href="#"""),_display_(/*22.44*/thingType),format.raw/*22.53*/("""">"""),_display_(/*22.56*/thingType),format.raw/*22.65*/("""</a></li>
		    """)))}),format.raw/*23.8*/("""
		  """),format.raw/*24.5*/("""</ul>
          <div class="row placeholders"></div>
          <div class = "tab-content">
            """),_display_(/*27.14*/for((thingType, query_results) <- documentMap) yield /*27.60*/ {_display_(Seq[Any](format.raw/*27.62*/("""
            
      			"""),format.raw/*29.10*/("""<div id=""""),_display_(/*29.20*/thingType),format.raw/*29.29*/("""" class="tab-pane fade in">
      			    """),_display_(/*30.15*/thingType/*30.24*/ match/*30.30*/{/*31.25*/case "PlatformModels" =>/*31.49*/ {_display_(Seq[Any](format.raw/*31.51*/(""" 
                            """),format.raw/*32.29*/("""<h2 class="sub-header">Platform Models</h2>
                            <div><p>(click for more information)</p></div>
                                <div class="panel-group" id="accordion" role="tablist" aria-multiselectable="true">
                                    <div class="panel panel-default">
                                        """),_display_(/*36.42*/for(triple <- query_results.triples_list) yield /*36.83*/{_display_(Seq[Any](format.raw/*36.84*/("""
                                            """),_display_(/*37.46*/if(triple.resultType == "PlatformModels")/*37.87*/{_display_(Seq[Any](format.raw/*37.88*/("""
                                                """),_display_(/*38.50*/platform_model_entry(triple)),format.raw/*38.78*/(""" 
                                            """)))}),format.raw/*39.46*/("""
                                        """)))}),format.raw/*40.42*/("""
                
                                    """),format.raw/*42.37*/("""</div>
                                </div>
                        """)))}/*45.10*/case "Platforms" =>/*45.29*/ {_display_(Seq[Any](format.raw/*45.31*/(""" 
                            """),format.raw/*46.29*/("""<h2 class="sub-header">Platforms</h2>
                            <div><p>(click for more information)</p></div>
                                <div class="panel-group" id="accordion" role="tablist" aria-multiselectable="true">
                                    <div class="panel panel-default">
                                        """),_display_(/*50.42*/for(triple <- query_results.triples_list) yield /*50.83*/{_display_(Seq[Any](format.raw/*50.84*/("""
                                            """),_display_(/*51.46*/if(triple.resultType == "Platforms")/*51.82*/{_display_(Seq[Any](format.raw/*51.83*/("""
                                                """),_display_(/*52.50*/platform_entry(triple)),format.raw/*52.72*/(""" 
                                            """)))}),format.raw/*53.46*/("""
                                        """)))}),format.raw/*54.42*/("""
                
                                    """),format.raw/*56.37*/("""</div>
                                </div>
                        """)))}/*59.25*/case "InstrumentModels" =>/*59.51*/ {_display_(Seq[Any](format.raw/*59.53*/(""" 
                            """),format.raw/*60.29*/("""<h2 class="sub-header">Instrument Models</h2>
                            <div><p>(click for more information)</p></div>
                                <div class="panel-group" id="accordion" role="tablist" aria-multiselectable="true">
                                    <div class="panel panel-default">
                                        """),_display_(/*64.42*/for(triple <- query_results.triples_list) yield /*64.83*/{_display_(Seq[Any](format.raw/*64.84*/("""
                                            """),_display_(/*65.46*/if(triple.resultType == "InstrumentModels")/*65.89*/{_display_(Seq[Any](format.raw/*65.90*/("""
                                                """),_display_(/*66.50*/instrument_model_entry(triple)),format.raw/*66.80*/(""" 
                                            """)))}),format.raw/*67.46*/("""
                                        """)))}),format.raw/*68.42*/("""
                
                                    """),format.raw/*70.37*/("""</div>
                                </div>
                        """)))}/*73.25*/case "Instruments" =>/*73.46*/ {_display_(Seq[Any](format.raw/*73.48*/(""" 
                            """),format.raw/*74.29*/("""<h2 class="sub-header">Instruments</h2>
                            <div><p>(click for more information)</p></div>
                                <div class="panel-group" id="accordion" role="tablist" aria-multiselectable="true">
                                    <div class="panel panel-default">
                                        """),_display_(/*78.42*/for(triple <- query_results.triples_list) yield /*78.83*/{_display_(Seq[Any](format.raw/*78.84*/("""
                                            """),_display_(/*79.46*/if(triple.resultType == "Instruments")/*79.84*/{_display_(Seq[Any](format.raw/*79.85*/("""
                                                """),_display_(/*80.50*/instrument_entry(triple)),format.raw/*80.74*/(""" 
                                            """)))}),format.raw/*81.46*/("""
                                        """)))}),format.raw/*82.42*/("""
                
                                    """),format.raw/*84.37*/("""</div>
                                </div>
                        """)))}/*87.25*/case "DetectorModels" =>/*87.49*/ {_display_(Seq[Any](format.raw/*87.51*/(""" 
                            """),format.raw/*88.29*/("""<h2 class="sub-header">Detector Models</h2>
                            <div><p>(click for more information)</p></div>
                                <div class="panel-group" id="accordion" role="tablist" aria-multiselectable="true">
                                    <div class="panel panel-default">
                                        """),_display_(/*92.42*/for(triple <- query_results.triples_list) yield /*92.83*/{_display_(Seq[Any](format.raw/*92.84*/("""
                                            """),_display_(/*93.46*/if(triple.resultType == "DetectorModels")/*93.87*/{_display_(Seq[Any](format.raw/*93.88*/("""
                                                """),_display_(/*94.50*/detector_model_entry(triple)),format.raw/*94.78*/(""" 
                                            """)))}),format.raw/*95.46*/("""
                                        """)))}),format.raw/*96.42*/("""
                
                                    """),format.raw/*98.37*/("""</div>
                                </div>
                        """)))}/*101.25*/case "Detectors" =>/*101.44*/ {_display_(Seq[Any](format.raw/*101.46*/(""" 
                            """),format.raw/*102.29*/("""<h2 class="sub-header">Detectors</h2>
                            <div><p>(click for more information)</p></div>
                                <div class="panel-group" id="accordion" role="tablist" aria-multiselectable="true">
                                    <div class="panel panel-default">
                                        """),_display_(/*106.42*/for(triple <- query_results.triples_list) yield /*106.83*/{_display_(Seq[Any](format.raw/*106.84*/("""
                                            """),_display_(/*107.46*/if(triple.resultType == "Detectors")/*107.82*/{_display_(Seq[Any](format.raw/*107.83*/("""
                                                """),_display_(/*108.50*/detector_entry(triple)),format.raw/*108.72*/(""" 
                                            """)))}),format.raw/*109.46*/("""
                                        """)))}),format.raw/*110.42*/("""
                
                                    """),format.raw/*112.37*/("""</div>
                                </div>
                        """)))}/*115.10*/case _ =>/*115.19*/{_display_(Seq[Any](format.raw/*115.20*/("""
      			            """),_display_(/*116.23*/metadata_table(query_results)),format.raw/*116.52*/("""
      				    """)))}}),format.raw/*118.15*/("""
      			"""),format.raw/*119.10*/("""</div>
      		""")))}),format.raw/*120.10*/("""
      		"""),_display_(/*121.10*/for((thingType, hierarchy_results) <- documentHierarchy) yield /*121.66*/ {_display_(Seq[Any](format.raw/*121.68*/("""
      			"""),format.raw/*122.10*/("""<div id=""""),_display_(/*122.20*/thingType),format.raw/*122.29*/("""" class="tab-pane fade in">
  					"""),_display_(/*123.9*/metadata_hierarchy(hierarchy_results)),format.raw/*123.46*/("""
      			"""),format.raw/*124.10*/("""</div>
      		""")))}),format.raw/*125.10*/("""
          """),format.raw/*126.11*/("""</div>
        </div>
      </div>
    </div>

""")))}),format.raw/*131.2*/("""
"""))}
  }

  def render(documentMap:Map[String, models.SparqlQueryResults],documentHierarchy:Map[String, String],final_query:String): play.twirl.api.HtmlFormat.Appendable = apply(documentMap,documentHierarchy,final_query)

  def f:((Map[String, models.SparqlQueryResults],Map[String, String],String) => play.twirl.api.HtmlFormat.Appendable) = (documentMap,documentHierarchy,final_query) => apply(documentMap,documentHierarchy,final_query)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Thu Jul 02 13:10:09 EDT 2015
                  SOURCE: /home/tetherless/metadata-browser/app/views/hierarchy_faceting.scala.html
                  HASH: 99b1b64ac0ea7fdbb46ced160df09389e860c1fd
                  MATRIX: 795->1|1049->124|1077->172|1104->174|1144->206|1183->208|1214->213|1286->259|1300->265|1354->299|1560->478|1592->489|1702->573|1764->619|1804->621|1843->632|1903->665|1933->674|1963->677|1993->686|2040->703|2074->711|2146->767|2186->769|2225->780|2285->813|2315->822|2345->825|2375->834|2422->851|2454->856|2585->960|2647->1006|2687->1008|2738->1031|2775->1041|2805->1050|2874->1092|2892->1101|2907->1107|2917->1133|2950->1157|2990->1159|3048->1189|3421->1535|3478->1576|3517->1577|3590->1623|3640->1664|3679->1665|3756->1715|3805->1743|3883->1790|3956->1832|4038->1886|4128->1977|4156->1996|4196->1998|4254->2028|4621->2368|4678->2409|4717->2410|4790->2456|4835->2492|4874->2493|4951->2543|4994->2565|5072->2612|5145->2654|5227->2708|5317->2804|5352->2830|5392->2832|5450->2862|5825->3210|5882->3251|5921->3252|5994->3298|6046->3341|6085->3342|6162->3392|6213->3422|6291->3469|6364->3511|6446->3565|6536->3685|6566->3706|6606->3708|6664->3738|7033->4080|7090->4121|7129->4122|7202->4168|7249->4206|7288->4207|7365->4257|7410->4281|7488->4328|7561->4370|7643->4424|7733->4520|7766->4544|7806->4546|7864->4576|8237->4922|8294->4963|8333->4964|8406->5010|8456->5051|8495->5052|8572->5102|8621->5130|8699->5177|8772->5219|8854->5273|8945->5398|8974->5417|9015->5419|9074->5449|9442->5789|9500->5830|9540->5831|9614->5877|9660->5913|9700->5914|9778->5964|9822->5986|9901->6033|9975->6075|10058->6129|10149->6210|10168->6219|10208->6220|10259->6243|10310->6272|10359->6303|10398->6313|10446->6329|10484->6339|10557->6395|10598->6397|10637->6407|10675->6417|10706->6426|10769->6462|10828->6499|10867->6509|10915->6525|10955->6536|11034->6584
                  LINES: 26->1|32->3|34->7|35->8|35->8|35->8|36->9|36->9|36->9|36->9|42->15|42->15|45->18|45->18|45->18|46->19|46->19|46->19|46->19|46->19|47->20|48->21|48->21|48->21|49->22|49->22|49->22|49->22|49->22|50->23|51->24|54->27|54->27|54->27|56->29|56->29|56->29|57->30|57->30|57->30|57->31|57->31|57->31|58->32|62->36|62->36|62->36|63->37|63->37|63->37|64->38|64->38|65->39|66->40|68->42|70->45|70->45|70->45|71->46|75->50|75->50|75->50|76->51|76->51|76->51|77->52|77->52|78->53|79->54|81->56|83->59|83->59|83->59|84->60|88->64|88->64|88->64|89->65|89->65|89->65|90->66|90->66|91->67|92->68|94->70|96->73|96->73|96->73|97->74|101->78|101->78|101->78|102->79|102->79|102->79|103->80|103->80|104->81|105->82|107->84|109->87|109->87|109->87|110->88|114->92|114->92|114->92|115->93|115->93|115->93|116->94|116->94|117->95|118->96|120->98|122->101|122->101|122->101|123->102|127->106|127->106|127->106|128->107|128->107|128->107|129->108|129->108|130->109|131->110|133->112|135->115|135->115|135->115|136->116|136->116|137->118|138->119|139->120|140->121|140->121|140->121|141->122|141->122|141->122|142->123|142->123|143->124|144->125|145->126|150->131
                  -- GENERATED --
              */
          