import openai
openai.api_key = "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"
response = openai.Completion.create(
  model="text-davinci-003",
  prompt="\nHuman:dfs java程式碼",
  temperature=0.9,
  max_tokens=2048,
  top_p=1,
  frequency_penalty=0.0,
  presence_penalty=0.6,
  stop=[" Human:", " AI:"]
)
print(response["choices"][0]["text"])