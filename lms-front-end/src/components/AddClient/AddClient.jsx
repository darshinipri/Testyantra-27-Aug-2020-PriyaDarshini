import React from "react";
import { Button, Col, Form } from "react-bootstrap";
import statelist from "./statelist.json";
import '../AddClient/addclient.css';

const AddClient = (props) => {
  return (
    <div className="col-md-6 offset-3 card card-body mt-5 addclient">
      <h2>
        <strong>Client Information</strong>
      </h2>
      <hr></hr>
      <Form>
        <Form.Group>
          <Form.Row>
            <Col>
              <Form.Label>FirstName</Form.Label>
              <Form.Control type="text"></Form.Control>
            </Col>
            <Col>
              <Form.Label>LastName</Form.Label>
              <Form.Control type="text"></Form.Control>
            </Col>
          </Form.Row>
        </Form.Group>
        <Form.Group>
          <Form.Label>Email</Form.Label>
          <Form.Control type="email"></Form.Control>
        </Form.Group>
        <Form.Group>
          <Form.Row>
            <Col>
              <Form.Label>Address1</Form.Label>
              <Form.Control as="textarea" rows="2"></Form.Control>
            </Col>
            <Col>
              <Form.Label>Address2</Form.Label>
              <Form.Control as="textarea" rows="2"></Form.Control>
            </Col>
          </Form.Row>
        </Form.Group>
        <Form.Group>
          <Form.Row>
            <Col>
              <Form.Label>Mobile1</Form.Label>
              <Form.Control type="tel"></Form.Control>
            </Col>
            <Col>
              <Form.Label>Mobile2</Form.Label>
              <Form.Control type="tel"></Form.Control>
            </Col>
          </Form.Row>
        </Form.Group>
        <Form.Group>
          <Form.Row>
            <Col>
              <Form.Label>State</Form.Label>
              <Form.Control as="select">
                {statelist.map((state) => (
                  <option>{state.name}</option>
                ))}
              </Form.Control>
            </Col>
            <Col>
              <Form.Label>City</Form.Label>
              <Form.Control type="text"></Form.Control>
            </Col>
          </Form.Row>
        </Form.Group>
        <Form.Group>
          <Form.Label>Client Status</Form.Label>
          <Form.Control as="select" defaultChecked="select">
            <option disabled>select</option>
            <option>ACTIVE</option>
            <option>INACTIVE</option>
          </Form.Control>
        </Form.Group>
        <Button variant="success" className="offset-md-5">Add</Button>
      </Form>
    </div>
  );
};

export default AddClient;
