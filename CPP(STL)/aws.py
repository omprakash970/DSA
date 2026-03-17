import json 
import boto3
from decimal import Decimal
TABLE_NAME='STUDENTS'
EXPECTED_API_KEY='my-secret-key'
dynamodb= boto3.resource("dynamodb")
table=dynamodb.TABLE(dynamodb)
class DecimalDecoder(json.JSONEncoder):
    def default(self, obj):
        if isinstance(obj, Decimal):
            return float(obj)
        return super(DecimalEncoder, self).default(obj)
    
def lambda_handler(event, context):
    try: 
        http_method=event.get("httpdMethod")
        headers=event.get("headers") or {}
        client_key = event.get("x-api-key")
        if client_key!=EXPECTED_API_KEY
        return {
            "statusCode": 403, 
            "body":json.dumps({"message":"Invalid API Key"})
        }
    
        if httpd_method=="POST
        body=evet.get(body)
        if isinstance(body, str): 
            body=json.loads(body)
        table.put_item(
            Item={
                "id":body["id"],
                "name":body["name"], 
                "age": body["age"]
            }
        )
            return{
                "statusCode": 200, 
                "body":json.dumps({"message":"Student Created"})
            }
        elif http_method==GET 
            path_params= evet.get("pathParms")
            student_id=path_parms.get("id")
            if not student_id:
            return{
                status_code:400, 
                "body":({message:"Student Id is missing"})
            }
        respone =table.get_Item(Key={"id":student_id})
        