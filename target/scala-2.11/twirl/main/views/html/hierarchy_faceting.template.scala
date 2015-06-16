
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
object hierarchy_faceting extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template10[Form[views.formdata.FacetFormData],models.FacetsWithCategories,models.FacetsWithCategories,models.FacetsWithCategories,models.FacetsWithCategories,models.FacetsWithCategories,String,String,Map[String, models.SparqlQueryResults],String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(  facetForm: Form[views.formdata.FacetFormData],
    fieldFacets: models.FacetsWithCategories,
    queryFacets: models.FacetsWithCategories,
    rangeFacets: models.FacetsWithCategories,
    pivotFacets: models.FacetsWithCategories,
    clusterFacets: models.FacetsWithCategories,
    thingType: String,
    predicate: String, 
    documentMap : Map[String, models.SparqlQueryResults],
    final_query : String):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import helper._

Seq[Any](format.raw/*10.26*/("""


"""),format.raw/*14.1*/("""
"""),_display_(/*15.2*/main("Hierarchy Faceted Search")/*15.34*/ {_display_(Seq[Any](format.raw/*15.36*/("""
    """),format.raw/*16.5*/("""<div class="container-fluid">
      
      <div class="row">
        <div class="col-sm-3 col-md-2 sidebar">
          """),_display_(/*20.12*/form(routes.Hierarchy.postIndex())/*20.46*/ {_display_(Seq[Any](format.raw/*20.48*/("""
            """),_display_(/*21.14*/hierarchy_fieldset(facetForm, fieldFacets, queryFacets, rangeFacets, pivotFacets, clusterFacets, thingType, predicate)),format.raw/*21.132*/("""
        """)))}),format.raw/*22.10*/("""
        """),format.raw/*23.9*/("""</div>
        <div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
          <h1 class="page-header">Metadata Browser</h1>
		  <h4>"""),_display_(/*26.10*/final_query),format.raw/*26.21*/("""</h4>
		  <div class="row placeholders"></div>
		  <ul class="nav nav-tabs">
		    <li><a data-toggle="tab" href="#Platforms">Platforms</a></li>
		    <li><a data-toggle="tab" href="#PlatformModels">Platform Models</a></li>
		    <li><a data-toggle="tab" href="#Instruments">Instruments</a></li>
		    <li><a data-toggle="tab" href="#InstrumentModels">Instrument Models</a></li>
		    <li><a data-toggle="tab" href="#Detectors">Detectors</a></li>
		    <li><a data-toggle="tab" href="#DetectorModels">Detector Models</a></li>
		    <li><a data-toggle="tab" href="#Entities">Entities</a></li>
		  </ul>
          <div class="row placeholders"></div>
          <div class = "tab-content">
          	"""),_display_(/*39.13*/for((collection, query_results) <- documentMap) yield /*39.60*/ {_display_(Seq[Any](format.raw/*39.62*/("""
          		
          			"""),format.raw/*41.14*/("""<div id=""""),_display_(/*41.24*/collection),format.raw/*41.34*/("""" class="tab-pane fade in">
          				"""),_display_(/*42.16*/metadata_table(query_results)),format.raw/*42.45*/("""
          			"""),format.raw/*43.14*/("""</div>
          		
          	""")))}),format.raw/*45.13*/("""
          """),format.raw/*46.11*/("""</div>
        </div>
      </div>
    </div>

""")))}),format.raw/*51.2*/("""
"""))}
  }

  def render(facetForm:Form[views.formdata.FacetFormData],fieldFacets:models.FacetsWithCategories,queryFacets:models.FacetsWithCategories,rangeFacets:models.FacetsWithCategories,pivotFacets:models.FacetsWithCategories,clusterFacets:models.FacetsWithCategories,thingType:String,predicate:String,documentMap:Map[String, models.SparqlQueryResults],final_query:String): play.twirl.api.HtmlFormat.Appendable = apply(facetForm,fieldFacets,queryFacets,rangeFacets,pivotFacets,clusterFacets,thingType,predicate,documentMap,final_query)

  def f:((Form[views.formdata.FacetFormData],models.FacetsWithCategories,models.FacetsWithCategories,models.FacetsWithCategories,models.FacetsWithCategories,models.FacetsWithCategories,String,String,Map[String, models.SparqlQueryResults],String) => play.twirl.api.HtmlFormat.Appendable) = (facetForm,fieldFacets,queryFacets,rangeFacets,pivotFacets,clusterFacets,thingType,predicate,documentMap,final_query) => apply(facetForm,fieldFacets,queryFacets,rangeFacets,pivotFacets,clusterFacets,thingType,predicate,documentMap,final_query)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Mon Jun 15 19:50:32 EDT 2015
                  SOURCE: /home/oneironym/jp/metadata-browser/app/views/hierarchy_faceting.scala.html
                  HASH: e7b655c17a4f65fcbc6757be51aeac45c3c61c96
                  MATRIX: 965->1|1481->413|1511->433|1539->435|1580->467|1620->469|1652->474|1799->594|1842->628|1882->630|1923->644|2063->762|2104->772|2140->781|2317->931|2349->942|3075->1641|3138->1688|3178->1690|3233->1717|3270->1727|3301->1737|3371->1780|3421->1809|3463->1823|3526->1855|3565->1866|3643->1914
                  LINES: 26->1|38->10|41->14|42->15|42->15|42->15|43->16|47->20|47->20|47->20|48->21|48->21|49->22|50->23|53->26|53->26|66->39|66->39|66->39|68->41|68->41|68->41|69->42|69->42|70->43|72->45|73->46|78->51
                  -- GENERATED --
              */
          