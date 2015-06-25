
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
      			    """),_display_(/*24.15*/if(thingType == "InstrumentModelsH")/*24.51*/ {_display_(Seq[Any](format.raw/*24.53*/("""
      			    
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
								<script>
									document.getElementById("test2").innerHTML = "GRAPH TEST 2";
                                </script>
    					   
    					   </div>

					""")))}/*45.8*/else/*45.13*/{_display_(Seq[Any](format.raw/*45.14*/("""      			    

      				   """),_display_(/*47.15*/metadata_table(query_results)),format.raw/*47.44*/("""

      				""")))}),format.raw/*49.12*/("""
      			"""),format.raw/*50.10*/("""</div>
      		""")))}),format.raw/*51.10*/("""
          """),format.raw/*52.11*/("""</div>
        </div>
      </div>
    </div>

""")))}),format.raw/*57.2*/("""
"""))}
  }

  def render(documentMap:Map[String, models.SparqlQueryResults],final_query:String): play.twirl.api.HtmlFormat.Appendable = apply(documentMap,final_query)

  def f:((Map[String, models.SparqlQueryResults],String) => play.twirl.api.HtmlFormat.Appendable) = (documentMap,final_query) => apply(documentMap,final_query)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Wed Jun 24 20:18:01 EDT 2015
                  SOURCE: /Users/paulopinheiro/Documents/workspace/metadata-browser/app/views/hierarchy_faceting.scala.html
                  HASH: e44f21e1038b438bb27ee4ddd6e6b66ef29001ca
                  MATRIX: 775->1|958->81|986->100|1013->102|1053->134|1092->136|1123->141|1322->313|1354->324|1464->408|1526->454|1566->456|1605->467|1665->500|1695->509|1725->512|1755->521|1802->538|1834->543|1965->647|2027->693|2067->695|2118->718|2155->728|2185->737|2254->779|2299->815|2339->817|2394->844|3306->1739|3319->1744|3358->1745|3414->1774|3464->1803|3508->1816|3546->1826|3593->1842|3632->1853|3710->1901
                  LINES: 26->1|30->2|32->5|33->6|33->6|33->6|34->7|39->12|39->12|42->15|42->15|42->15|43->16|43->16|43->16|43->16|43->16|44->17|45->18|48->21|48->21|48->21|50->23|50->23|50->23|51->24|51->24|51->24|53->26|72->45|72->45|72->45|74->47|74->47|76->49|77->50|78->51|79->52|84->57
                  -- GENERATED --
              */
          