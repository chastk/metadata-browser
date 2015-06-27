
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
object hierarchy_faceting extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Map[String, models.SparqlQueryResults],String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/( documentMap : Map[String, models.SparqlQueryResults],
   final_query : String):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import helper._

Seq[Any](format.raw/*2.25*/("""

"""),format.raw/*5.1*/("""
"""),_display_(/*6.2*/main("Hierarchy Faceted Search")/*6.34*/ {_display_(Seq[Any](format.raw/*6.36*/("""
    """),format.raw/*7.5*/("""<div class="container-fluid">
      
      <div class="row">
        <div class="col-sm-9 col-md-10 main">
          <h1 class="page-header">Metadata Browser</h1>
		  <h4>"""),_display_(/*12.10*/final_query),format.raw/*12.21*/("""</h4>
		  <div class="row placeholders"></div>
		  <ul class="nav nav-tabs">
		    """),_display_(/*15.8*/for((thingType, query_results) <- documentMap) yield /*15.54*/ {_display_(Seq[Any](format.raw/*15.56*/("""
    		    """),format.raw/*16.11*/("""<li><a data-toggle="tab" href="#"""),_display_(/*16.44*/thingType),format.raw/*16.53*/("""">"""),_display_(/*16.56*/thingType),format.raw/*16.65*/("""</a></li>
		    """)))}),format.raw/*17.8*/("""
		  """),format.raw/*18.5*/("""</ul>
          <div class="row placeholders"></div>
          <div class = "tab-content">
            """),_display_(/*21.14*/for((thingType, query_results) <- documentMap) yield /*21.60*/ {_display_(Seq[Any](format.raw/*21.62*/("""
            
      			"""),format.raw/*23.10*/("""<div id=""""),_display_(/*23.20*/thingType),format.raw/*23.29*/("""" class="tab-pane fade in">
      			    """),_display_(/*24.15*/thingType/*24.24*/ match/*24.30*/{/*25.25*/case "InstrumentModelsH" =>/*25.52*/ {_display_(Seq[Any](format.raw/*25.54*/("""
    				    """),format.raw/*26.13*/("""<h2 class="sub-header">Results</h2>
    					   <div class="table-responsive">
    		
							    <div id="body">
      								<div id="footer">
      								</div>
    							</div>

    							<link type="text/css" rel="stylesheet" href="http://mbostock.github.io/d3/talk/20111018/style.css"/>
					      		<script type="text/javascript" src="http://mbostock.github.io/d3/talk/20111018/d3/d3.js"></script>
    							<script type="text/javascript" src="http://mbostock.github.io/d3/talk/20111018/d3/d3.layout.js"></script>
    							<script type="text/javascript" src="/assets/javascripts/treeRenderer.js"></script>  					   
    							<link type="text/css" rel="stylesheet" href="/assets/stylesheets/treeRenderer.css"/>
    					   
    					   </div>
					    """)))}/*42.10*/case "Platforms" =>/*42.29*/ {_display_(Seq[Any](format.raw/*42.31*/(""" 
                            """),format.raw/*43.29*/("""<h2 class="sub-header">Platforms</h2>
                            <div><p>(click for more information)</p></div>
                                <div class="panel-group" id="accordion" role="tablist" aria-multiselectable="true">
                                    <div class="panel panel-default">
                                        """),_display_(/*47.42*/for(triple <- query_results.triples_list) yield /*47.83*/{_display_(Seq[Any](format.raw/*47.84*/("""
                                            """),_display_(/*48.46*/if(triple.resultType == "Platforms")/*48.82*/{_display_(Seq[Any](format.raw/*48.83*/("""
                                                """),_display_(/*49.50*/platform_entry(triple)),format.raw/*49.72*/(""" 
                                            """)))}),format.raw/*50.46*/("""
                                        """)))}),format.raw/*51.42*/("""
                
                                    """),format.raw/*53.37*/("""</div>
                                </div>
                        """)))}/*56.10*/case _ =>/*56.19*/{_display_(Seq[Any](format.raw/*56.20*/("""
      			            """),_display_(/*57.23*/metadata_table(query_results)),format.raw/*57.52*/("""
      				    """)))}}),format.raw/*59.15*/("""
      			"""),format.raw/*60.10*/("""</div>
      		""")))}),format.raw/*61.10*/("""
          """),format.raw/*62.11*/("""</div>
        </div>
      </div>
    </div>

""")))}),format.raw/*67.2*/("""
"""))}
  }

  def render(documentMap:Map[String, models.SparqlQueryResults],final_query:String): play.twirl.api.HtmlFormat.Appendable = apply(documentMap,final_query)

  def f:((Map[String, models.SparqlQueryResults],String) => play.twirl.api.HtmlFormat.Appendable) = (documentMap,final_query) => apply(documentMap,final_query)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Fri Jun 26 20:28:05 EDT 2015
                  SOURCE: /home/oneironym/jp/metadata-browser/app/views/hierarchy_faceting.scala.html
                  HASH: adff13b090e3f7d55f4473b5afc38a7f9312b8ce
                  MATRIX: 775->1|958->81|986->100|1013->102|1053->134|1092->136|1123->141|1322->313|1354->324|1464->408|1526->454|1566->456|1605->467|1665->500|1695->509|1725->512|1755->521|1802->538|1834->543|1965->647|2027->693|2067->695|2118->718|2155->728|2185->737|2254->779|2272->788|2287->794|2297->820|2333->847|2373->849|2414->862|3201->1641|3229->1660|3269->1662|3327->1692|3694->2032|3751->2073|3790->2074|3863->2120|3908->2156|3947->2157|4024->2207|4067->2229|4145->2276|4218->2318|4300->2372|4390->2453|4408->2462|4447->2463|4497->2486|4547->2515|4595->2546|4633->2556|4680->2572|4719->2583|4797->2631
                  LINES: 26->1|30->2|32->5|33->6|33->6|33->6|34->7|39->12|39->12|42->15|42->15|42->15|43->16|43->16|43->16|43->16|43->16|44->17|45->18|48->21|48->21|48->21|50->23|50->23|50->23|51->24|51->24|51->24|51->25|51->25|51->25|52->26|67->42|67->42|67->42|68->43|72->47|72->47|72->47|73->48|73->48|73->48|74->49|74->49|75->50|76->51|78->53|80->56|80->56|80->56|81->57|81->57|82->59|83->60|84->61|85->62|90->67
                  -- GENERATED --
              */
          