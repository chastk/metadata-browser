
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
    """),format.raw/*7.5*/("""<link rel="stylesheet" type="text/css" href='"""),_display_(/*7.51*/routes/*7.57*/.Assets.at("stylesheets/main.css")),format.raw/*7.91*/("""'>
    <div class="container-fluid">
      
      <div class="row">
        <div class="col-sm-9 col-md-10 main">
          <h1 class="page-header">Metadata Browser</h1>
		  <h4>"""),_display_(/*13.10*/final_query),format.raw/*13.21*/("""</h4>
		  <div class="row placeholders"></div>
		  <ul class="nav nav-tabs">
		    """),_display_(/*16.8*/for((thingType, query_results) <- documentMap) yield /*16.54*/ {_display_(Seq[Any](format.raw/*16.56*/("""
    		    """),format.raw/*17.11*/("""<li><a data-toggle="tab" href="#"""),_display_(/*17.44*/thingType),format.raw/*17.53*/("""">"""),_display_(/*17.56*/thingType),format.raw/*17.65*/("""</a></li>
		    """)))}),format.raw/*18.8*/("""
		  """),format.raw/*19.5*/("""</ul>
          <div class="row placeholders"></div>
          <div class = "tab-content">
            """),_display_(/*22.14*/for((thingType, query_results) <- documentMap) yield /*22.60*/ {_display_(Seq[Any](format.raw/*22.62*/("""
            
      			"""),format.raw/*24.10*/("""<div id=""""),_display_(/*24.20*/thingType),format.raw/*24.29*/("""" class="tab-pane fade in">
      			    """),_display_(/*25.15*/thingType/*25.24*/ match/*25.30*/{/*26.25*/case "InstrumentModelsH" =>/*26.52*/ {_display_(Seq[Any](format.raw/*26.54*/("""
    				    """),format.raw/*27.13*/("""<h2 class="sub-header">Results</h2>
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
					    """)))}/*43.25*/case "PlatformModels" =>/*43.49*/ {_display_(Seq[Any](format.raw/*43.51*/(""" 
                            """),format.raw/*44.29*/("""<h2 class="sub-header">Platform Models</h2>
                            <div><p>(click for more information)</p></div>
                                <div class="panel-group" id="accordion" role="tablist" aria-multiselectable="true">
                                    <div class="panel panel-default">
                                        """),_display_(/*48.42*/for(triple <- query_results.triples_list) yield /*48.83*/{_display_(Seq[Any](format.raw/*48.84*/("""
                                            """),_display_(/*49.46*/if(triple.resultType == "PlatformModels")/*49.87*/{_display_(Seq[Any](format.raw/*49.88*/("""
                                                """),_display_(/*50.50*/platform_model_entry(triple)),format.raw/*50.78*/(""" 
                                            """)))}),format.raw/*51.46*/("""
                                        """)))}),format.raw/*52.42*/("""
                
                                    """),format.raw/*54.37*/("""</div>
                                </div>
                        """)))}/*57.10*/case "Platforms" =>/*57.29*/ {_display_(Seq[Any](format.raw/*57.31*/(""" 
                            """),format.raw/*58.29*/("""<h2 class="sub-header">Platforms</h2>
                            <div><p>(click for more information)</p></div>
                                <div class="panel-group" id="accordion" role="tablist" aria-multiselectable="true">
                                    <div class="panel panel-default">
                                        """),_display_(/*62.42*/for(triple <- query_results.triples_list) yield /*62.83*/{_display_(Seq[Any](format.raw/*62.84*/("""
                                            """),_display_(/*63.46*/if(triple.resultType == "Platforms")/*63.82*/{_display_(Seq[Any](format.raw/*63.83*/("""
                                                """),_display_(/*64.50*/platform_entry(triple)),format.raw/*64.72*/(""" 
                                            """)))}),format.raw/*65.46*/("""
                                        """)))}),format.raw/*66.42*/("""
                
                                    """),format.raw/*68.37*/("""</div>
                                </div>
                        """)))}/*71.25*/case "InstrumentModels" =>/*71.51*/ {_display_(Seq[Any](format.raw/*71.53*/(""" 
                            """),format.raw/*72.29*/("""<h2 class="sub-header">Instrument Models</h2>
                            <div><p>(click for more information)</p></div>
                                <div class="panel-group" id="accordion" role="tablist" aria-multiselectable="true">
                                    <div class="panel panel-default">
                                        """),_display_(/*76.42*/for(triple <- query_results.triples_list) yield /*76.83*/{_display_(Seq[Any](format.raw/*76.84*/("""
                                            """),_display_(/*77.46*/if(triple.resultType == "InstrumentModels")/*77.89*/{_display_(Seq[Any](format.raw/*77.90*/("""
                                                """),_display_(/*78.50*/instrument_model_entry(triple)),format.raw/*78.80*/(""" 
                                            """)))}),format.raw/*79.46*/("""
                                        """)))}),format.raw/*80.42*/("""
                
                                    """),format.raw/*82.37*/("""</div>
                                </div>
                        """)))}/*85.25*/case "Instruments" =>/*85.46*/ {_display_(Seq[Any](format.raw/*85.48*/(""" 
                            """),format.raw/*86.29*/("""<h2 class="sub-header">Instruments</h2>
                            <div><p>(click for more information)</p></div>
                                <div class="panel-group" id="accordion" role="tablist" aria-multiselectable="true">
                                    <div class="panel panel-default">
                                        """),_display_(/*90.42*/for(triple <- query_results.triples_list) yield /*90.83*/{_display_(Seq[Any](format.raw/*90.84*/("""
                                            """),_display_(/*91.46*/if(triple.resultType == "Instruments")/*91.84*/{_display_(Seq[Any](format.raw/*91.85*/("""
                                                """),_display_(/*92.50*/instrument_entry(triple)),format.raw/*92.74*/(""" 
                                            """)))}),format.raw/*93.46*/("""
                                        """)))}),format.raw/*94.42*/("""
                
                                    """),format.raw/*96.37*/("""</div>
                                </div>
                        """)))}/*99.25*/case "DetectorModels" =>/*99.49*/ {_display_(Seq[Any](format.raw/*99.51*/(""" 
                            """),format.raw/*100.29*/("""<h2 class="sub-header">Detector Models</h2>
                            <div><p>(click for more information)</p></div>
                                <div class="panel-group" id="accordion" role="tablist" aria-multiselectable="true">
                                    <div class="panel panel-default">
                                        """),_display_(/*104.42*/for(triple <- query_results.triples_list) yield /*104.83*/{_display_(Seq[Any](format.raw/*104.84*/("""
                                            """),_display_(/*105.46*/if(triple.resultType == "DetectorModels")/*105.87*/{_display_(Seq[Any](format.raw/*105.88*/("""
                                                """),_display_(/*106.50*/detector_model_entry(triple)),format.raw/*106.78*/(""" 
                                            """)))}),format.raw/*107.46*/("""
                                        """)))}),format.raw/*108.42*/("""
                
                                    """),format.raw/*110.37*/("""</div>
                                </div>
                        """)))}/*113.25*/case "Detectors" =>/*113.44*/ {_display_(Seq[Any](format.raw/*113.46*/(""" 
                            """),format.raw/*114.29*/("""<h2 class="sub-header">Detectors</h2>
                            <div><p>(click for more information)</p></div>
                                <div class="panel-group" id="accordion" role="tablist" aria-multiselectable="true">
                                    <div class="panel panel-default">
                                        """),_display_(/*118.42*/for(triple <- query_results.triples_list) yield /*118.83*/{_display_(Seq[Any](format.raw/*118.84*/("""
                                            """),_display_(/*119.46*/if(triple.resultType == "Detectors")/*119.82*/{_display_(Seq[Any](format.raw/*119.83*/("""
                                                """),_display_(/*120.50*/detector_entry(triple)),format.raw/*120.72*/(""" 
                                            """)))}),format.raw/*121.46*/("""
                                        """)))}),format.raw/*122.42*/("""
                
                                    """),format.raw/*124.37*/("""</div>
                                </div>
                        """)))}/*127.10*/case _ =>/*127.19*/{_display_(Seq[Any](format.raw/*127.20*/("""
      			            """),_display_(/*128.23*/metadata_table(query_results)),format.raw/*128.52*/("""
      				    """)))}}),format.raw/*130.15*/("""
      			"""),format.raw/*131.10*/("""</div>
      		""")))}),format.raw/*132.10*/("""
          """),format.raw/*133.11*/("""</div>
        </div>
      </div>
    </div>

""")))}),format.raw/*138.2*/("""
"""))}
  }

  def render(documentMap:Map[String, models.SparqlQueryResults],final_query:String): play.twirl.api.HtmlFormat.Appendable = apply(documentMap,final_query)

  def f:((Map[String, models.SparqlQueryResults],String) => play.twirl.api.HtmlFormat.Appendable) = (documentMap,final_query) => apply(documentMap,final_query)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Jun 30 18:53:08 EDT 2015
                  SOURCE: /home/oneironym/jp/metadata-browser/app/views/hierarchy_faceting.scala.html
                  HASH: 8085cc1235b4a327ea7a170eb3260badefa858bf
                  MATRIX: 775->1|958->81|986->100|1013->102|1053->134|1092->136|1123->141|1195->187|1209->193|1263->227|1469->406|1501->417|1611->501|1673->547|1713->549|1752->560|1812->593|1842->602|1872->605|1902->614|1949->631|1981->636|2112->740|2174->786|2214->788|2265->811|2302->821|2332->830|2401->872|2419->881|2434->887|2444->913|2480->940|2520->942|2561->955|3348->1749|3381->1773|3421->1775|3479->1805|3852->2151|3909->2192|3948->2193|4021->2239|4071->2280|4110->2281|4187->2331|4236->2359|4314->2406|4387->2448|4469->2502|4559->2593|4587->2612|4627->2614|4685->2644|5052->2984|5109->3025|5148->3026|5221->3072|5266->3108|5305->3109|5382->3159|5425->3181|5503->3228|5576->3270|5658->3324|5748->3420|5783->3446|5823->3448|5881->3478|6256->3826|6313->3867|6352->3868|6425->3914|6477->3957|6516->3958|6593->4008|6644->4038|6722->4085|6795->4127|6877->4181|6967->4301|6997->4322|7037->4324|7095->4354|7464->4696|7521->4737|7560->4738|7633->4784|7680->4822|7719->4823|7796->4873|7841->4897|7919->4944|7992->4986|8074->5040|8164->5136|8197->5160|8237->5162|8296->5192|8670->5538|8728->5579|8768->5580|8842->5626|8893->5667|8933->5668|9011->5718|9061->5746|9140->5793|9214->5835|9297->5889|9388->6014|9417->6033|9458->6035|9517->6065|9885->6405|9943->6446|9983->6447|10057->6493|10103->6529|10143->6530|10221->6580|10265->6602|10344->6649|10418->6691|10501->6745|10592->6826|10611->6835|10651->6836|10702->6859|10753->6888|10802->6919|10841->6929|10889->6945|10929->6956|11008->7004
                  LINES: 26->1|30->2|32->5|33->6|33->6|33->6|34->7|34->7|34->7|34->7|40->13|40->13|43->16|43->16|43->16|44->17|44->17|44->17|44->17|44->17|45->18|46->19|49->22|49->22|49->22|51->24|51->24|51->24|52->25|52->25|52->25|52->26|52->26|52->26|53->27|68->43|68->43|68->43|69->44|73->48|73->48|73->48|74->49|74->49|74->49|75->50|75->50|76->51|77->52|79->54|81->57|81->57|81->57|82->58|86->62|86->62|86->62|87->63|87->63|87->63|88->64|88->64|89->65|90->66|92->68|94->71|94->71|94->71|95->72|99->76|99->76|99->76|100->77|100->77|100->77|101->78|101->78|102->79|103->80|105->82|107->85|107->85|107->85|108->86|112->90|112->90|112->90|113->91|113->91|113->91|114->92|114->92|115->93|116->94|118->96|120->99|120->99|120->99|121->100|125->104|125->104|125->104|126->105|126->105|126->105|127->106|127->106|128->107|129->108|131->110|133->113|133->113|133->113|134->114|138->118|138->118|138->118|139->119|139->119|139->119|140->120|140->120|141->121|142->122|144->124|146->127|146->127|146->127|147->128|147->128|148->130|149->131|150->132|151->133|156->138
                  -- GENERATED --
              */
          