namespace java java.thrift.generated
namespace py py.thrift.generated

struct PredictRequest {
    1: list<string> symptoms
}

struct PredictItem {
    1: string herb_id
    2: double score
}

struct PredictResponse {
    1: string code
    2: list<PredictItem> result
    3: optional string msg
}

struct GraphRequset {
    1: list<string> herbs
    2: string embedType
}

struct RelItem {
    1: string source
    2: string target
    3: double weight
}

struct PosItem {
    1: string id
    2: double x
    3: double y
}

struct GraphResponse {
    1: string code
    2: list<RelItem> rel
    3: list<PosItem> node
    4: optional string msg
}

struct GetClusterRequest {
    1: ClusterSetting setting
    2: list<string> targets
}

struct ClusterSetting {
    1: double resolution
    2: double beta
    3: string obj_func
}

struct ClusterResultItem {
    1: string id
    2: i32 cluster
    3: double pageRank
    4: double betweenness
}

struct GetClusterResponse {
    1: string code
    2: list<ClusterResultItem> clusterResult
    3: list<RelItem> rel
    4: optional string msg
}

struct EnrichmentSetting {
    1: string gene_set
    2: double cutoff
}

struct EnrichmentRequest {
    1: list<string> targets
    2: EnrichmentSetting setting
}

struct EnrichmentReusltItem {
    1: string gene_set
    2: string term
    3: string overlap
    4: double p
    5: double adjusted_p
    6: double old_p
    7: double old_adjusted_p
    8: double odds_ratio
    9: double combined_score
    10: list<string> genes
}

struct EnrichmentResponse {
    1: string code
    2: list<EnrichmentReusltItem> result
    3: optional string msg
}

service PredictService {
    PredictResponse Predict(1: PredictRequest req)
    GraphResponse GetGraph(1: GraphRequset req)
    GetClusterResponse GetCluster(1: GetClusterRequest req)
    EnrichmentResponse GetEnrichment(1: EnrichmentRequest req)
}