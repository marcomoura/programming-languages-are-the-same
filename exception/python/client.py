import traceback

class Client():
  def __init__(self):
    try:
      raise Exception('VROOM!')
    except Exception as e:
      traceback.print_exc()
      print e
    finally:
      print 'Finish'

Client()
