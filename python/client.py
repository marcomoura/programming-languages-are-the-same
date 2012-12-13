class Client():
  def __init__(self):
    try:
      raise Exception("with exception")
      print 'without error'
    except Exception as e:
      print e

Client()
