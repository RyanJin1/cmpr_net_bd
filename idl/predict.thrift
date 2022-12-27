namespace java java.thrift.generated
namespace py py.thrift.generated

struct PredictRequest {
    1: list<i32> symptoms
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

service PredictService {
    PredictResponse Predict(1: PredictRequest req)
}